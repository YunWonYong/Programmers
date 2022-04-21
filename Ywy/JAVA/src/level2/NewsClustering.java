package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
interface Group {
	public int size();
	public String next();
	public boolean hasNext();
	public int getCount(String key);
}

abstract class AbstractGroup implements Group {
	protected final Map<String, Integer> MAP;
	protected final List<String> KEYS;
	protected int size;
	protected final String str;
	private int current = 0;
	protected AbstractGroup(String str) {
		this.str = str;
		MAP = new HashMap<>();
		KEYS = new ArrayList<>();
	}
	
	public int size() {
		return size;
	}
	
	public boolean hasNext() {
		return current < size;
	}
	
	public String next() {
		return KEYS.get(current++);
	}
	
	public int getCount(String key) {
		Integer i = MAP.get(key);
		return i == null ? 0 : i;
	}
	
	protected AbstractGroup init() {
		strSplit(str.toUpperCase());
		size = KEYS.size();
		return this;
	}
	
	protected abstract void strSplit(String str); 
	
}

class Sets extends AbstractGroup {
	public Sets(String str) {
		super(str);
	}

	@Override
	protected void strSplit(String str) {
		str.chars().reduce((prev, next) -> {
			if (65 <= prev && prev <= 90 && 65 <= next && next <= 90) {
				String key = new String(new char[] {(char)prev, (char)next});
				Integer count = MAP.get(key);
				if (count == null) {
					KEYS.add(key);
					count = 0;
				}
				MAP.put(key, ++count);
			}
			return next;
		});
	}
}

public class NewsClustering {
	public int solution(String str1, String str2) {
		double similarity = 1.0_0;
		Group A = new Sets(str1).init();
		Group B = new Sets(str2).init();
		Group temp = null;
		if (A.size() < B.size()) {
			temp = A;
			A = B;
			B = temp;
		}
		Map<String, Integer> map = separateIntoSet(A, B);
		
		int unionCount = map.get("union");
		int intersectionCount = map.get("intersection");
		if ((unionCount == 0 && intersectionCount == 0) || unionCount == intersectionCount) {
			return 65536;
		}
		similarity *= intersectionCount;
		similarity /= unionCount;
		return (int)(similarity * 65536);
	}

	private Map<String, Integer> separateIntoSet(Group a, Group b) {
		Map<String, Integer> map = new HashMap<>();
		List<String> union = new ArrayList<String>();
		List<String> intersection = new ArrayList<String>();
		String key = null;
		int aCount = 0;
		int bCount = 0;
		while(a.hasNext()) {
			key = a.next();
			aCount = a.getCount(key);
			bCount = b.getCount(key);
			append(union, key, Math.max(aCount, bCount));
			if (bCount == 0) {
				continue;
			}
			append(intersection, key, Math.min(aCount, bCount));
			
		}
		
		while (b.hasNext()) {
			key = b.next();
			if (union.indexOf(key) > -1) {
				continue;
			}
			append(union, key, b.getCount(key));
		}
		map.put("union", union.size());
		map.put("intersection", intersection.size());
		return map;
	}

	private void append(List<String> set, String key, int count) {
		while (--count > -1) {
			set.add(key);
		}
	}
}
