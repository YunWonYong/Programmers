package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
class SetStack {
	private int[][] arr;
	private int top;
	public SetStack(int capacity) {
		arr = new int[capacity][2];
	}
	
	public int[] pop() {
		return arr[--top];
	}
	
	public void push(int i, int j) {
		arr[top++] = new int[] {i, j};
	}
	
	public void clear() {
		top = 0;
	}
	
	public int size() {
		return top;
	}
	
	public String toString() {
		int index = 0;
		int range = top;
		StringBuffer sb = new StringBuffer();
		while (index < range) {
			sb.append("top(")
			  .append(index)
			  .append(") =>")
			  .append("{")
			  .append(arr[index][0])
			  .append(", ")
			  .append(arr[index++][1])
			  .append("}");
			if (index == range) {
				break;
			}
			sb.append("\n");
		}
		return sb.toString();
	} 
}

public class MenuRenewal {

	public String[] solution(String[] orders, int[] corse) {
		String[] answer = new String[0];
		Map<Integer, Integer> corses = menuCombinations(corse);
		int index = 0;
		int range = orders.length;
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> check = new HashMap<>();
		do {
			menuCheck(check, orders[index]);
		} while (++index < range);
 		index = 0;
		do {
			menuMix(corse, map, check, orders[index]);
		} while (++index < range);
		
		Iterator<String> it = map.keySet().iterator();
		String key = null;
		Map<Integer, StringBuffer> map2 = new HashMap<>();
		Integer count = 0;
		while ((it.hasNext() ? key = it.next() : null) != null) {
			count = map.get(key);
			range = key.length();
			if (count < 2) {
				continue;
			} else if (corses.get(range) != null && corses.get(range) < count) {
				corses.put(range, count);
				map2.put(range, new StringBuffer().append(key));
			} else if (corses.get(range) != null && corses.get(range) == count) {
				map2.get(range).append(",").append(key);
			}
		}

		range = corse.length;
		String[] menu = null;
		StringBuffer sb = null;
		while (--range > -1) {
			sb = map2.get(corse[range]);
			if (sb == null || sb.length() == 0) {
				continue;
			}
			menu = sb.toString().split(",");
			answer = merge(answer, menu);
		}

		Arrays.sort(answer);
		return answer;
	}

	private void menuCheck(Map<String, Integer> check, String order) {
		for (String menu: order.split("")) {
			check.put(menu, check.getOrDefault(menu, 0) + 1);
		}
	}

	private Map<String, Integer> menuMix(int[] corse, Map<String, Integer> map, Map<String, Integer> check, String order) {
		List<String> menus = new ArrayList<>();
		for (String menu : order.split("")) {
			if (check.get(menu) < 2) {
				continue;
			}
			menus.add(menu);
		}
		Collections.sort(menus);
		int index = 0;
		int range = menus.size();
		int cIndex = 0;
		int cRange = corse.length;
		SetStack stack = new SetStack(range + range);
		int[] temp = null;
		int[] mark = new int[range];
		String menu = null;
		Map<Integer, Boolean> m = new HashMap<>(); 
		while(true) {
			m.put(corse[cIndex++], true);
			
			if (cIndex == cRange) {
				break;
			}
		}

		stack.push(index, 1);
		stack.push(index, 0);
		while(true) {
			temp = stack.pop();
			mark[temp[0]] = temp[1];
			if (temp[0] < range -1) {
				index = temp[0] + 1;
				stack.push(index, 1);
				stack.push(index, 0);
			}
			
			menu = getMarkingStr(mark, menus);
			if (temp[0] >= range - 1 && m.get(menu.length()) != null) {
				map.put(menu, map.getOrDefault(menu, 0) + 1);
			}
			
			if (stack.size() == 0) {
				break;
			}
		}
		return map;
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

	public Map<Integer, Integer> menuCombinations(int[] corse) {
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		int range = corse.length;
		do {
			map.put(corse[index], 0);
		} while (++index < range);
		return map;
	}
	
	private String getMarkingStr(int[] marks, List<String> list) {
		StringBuffer sb = new StringBuffer();
		int index = 0;
		int range = marks.length;
		String temp = null;
		int mark = 0;
		char[] ats = null;
		while(true) {
			mark = marks[index++];
			if (mark == 1) {
				sb.append(list.get(index - 1));
			}
			
			if (index == range) {
				temp = sb.toString();
				ats = temp.toCharArray();
				Arrays.sort(ats);
				return new String(ats);
			}
		}
	}
}
