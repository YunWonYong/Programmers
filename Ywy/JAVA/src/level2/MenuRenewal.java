package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MenuRenewal {
	private int max;

	public String[] solution(String[] orders, int[] corse) {
		Map<Integer, Integer> corses = menuCombinations(corse);
		max = corse[corse.length - 1];
		Map<String, Integer> map = new HashMap<>();
		int index = 0;
		int range = orders.length;
		do {
			test(orders[index], corses, map);
		} while (++index < range);
		Iterator<String> it = map.keySet().iterator();
		String key = null;
		Map<Integer, StringBuffer> map2 = new HashMap<>();
		Map<Integer, Integer> map3 = new HashMap<>();
		Integer count = 0;
		while((it.hasNext() ? key = it.next() : null) != null) {
			count = map.get(key);
			range = key.length();
			if (corses.get(range) < count) {
				corses.put(range, count);
				map3.put(count, range);
				map2.put(range, new StringBuffer().append(key));
			} else if (corses.get(range) == count) {
				map2.get(range).append(",").append(key);
			}
		}
		
		range = corse.length;
		String[] answer = new String[0];
		String[] menu = null;
		StringBuffer sb = null;
		while (--range > -1) {
			sb = map2.get(map3.get(corse[range]));
			if (sb == null || sb.length() == 0) {
				continue;
			}
			menu = sb.toString().split(",");
			answer = merge(answer, menu);
		}

		Arrays.sort(answer);
		return answer;
	}

	private String[] merge(String[] answer, String[] menu) {
		int index = 0;
		int range = answer.length;
		int inputIndex = 0;
		String[] temp = new String[range + menu.length];
		while (index < range) {
			temp[inputIndex++] = answer[index++];
		}
		index = 0;
		range = menu.length;
		while (index < range) {
			temp[inputIndex++] = menu[index++];
		}
		return temp;
	}

	private void test(String order, Map<Integer, Integer> corses, Map<String, Integer> map) {
		StringBuffer sb = new StringBuffer();
		String[] orders = order.split("");
		int index = 0;
		int index2 = 0;
		int index3 = 0;
		int i = 0;
		int range = order.length();
		String key = null;

		char[] ats = null;
		do {
			index = i;
			do {
				sb.append(orders[index++]);
				index2 = index;
				if (sb.length() == max) {
					break;
				}
				while (index2 < range) {
					sb.append(orders[index2++]);
					key = sb.toString();
					if (key.length() == max) {
						sb.setLength(sb.length() - 1);
						break;
					} else if (key.length() == 2 && corses.get(key.length()) != null) {

						ats = key.toCharArray();
						Arrays.sort(ats);
						key = new String(ats);
						map.put(key, map.getOrDefault(key, 0) + 1);
					}

					index3 = index2;
					while (index3 < range) {
						sb.append(orders[index3++]);
						key = sb.toString();
						if (corses.get(key.length()) == null) {
							break;
						}
						ats = key.toCharArray();
						Arrays.sort(ats);
						key = new String(ats);
						map.put(key, map.getOrDefault(key, 0) + 1);
						sb.setLength(sb.length() - 1);
					}
					sb.setLength(sb.length() - 1);
				}
			} while (index < range);
			sb.setLength(0);
		} while (++i < range - 1);
	}

	public Map<Integer, Integer> menuCombinations(int[] corse) {
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		int range = corse.length;
		do {
			map.put(corse[index], 0);
		} while (++index < range);
		return map;
	}
}
