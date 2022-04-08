package level2;

import java.util.HashMap;
import java.util.Map;

public class Tuple {
	public int[] solution(String s) {
		final Map<Integer, String[]> tuple = new HashMap<>();
		
		String[] sets = s.replace("{", "").replace("},", "#").replace("}", "").split("#");
		int size = setUp(tuple, sets);
		int[] answer = new int[size];
		int index = 0;
		int el = -1;
		String[] arr = null;
		while((arr = tuple.get(index + 1)) != null) {
			for (String at: arr) {
				el = find(answer, at);
				if (el > -1) {
					answer[index] = el;
					break;
				}
			}
			index++;
		}
		
		return answer;
	}

	private int setUp(Map<Integer, String[]> tuple, String[] sets) {
		int max = 0;
		String[] temp = null;
		for (String set : sets) {
			temp = set.split(",");
			tuple.put(temp.length, temp);
			if (max < temp.length) {
				max = temp.length;
			}
		}
		return max;
	}
	
	private int find(int[] answer, String at) {
		int target = Integer.parseInt(at);
		int index = 0;
		int range = answer.length;
		int temp = 0;
		while(true) {
			temp = answer[index++];
			if (temp == target) {
				return -1;
			} else if (temp == 0 || index == range) {
				return target;
			}
		}
	}
}
