package level2;

import java.util.HashMap;
import java.util.Map;

public class CheckDistance {
	public int[] solution(String[][] places) {
		final int[] answer = new int[5];
		int index = 0;
		int range = places.length;
		while(true) {
			answer[index] = check(places[index++]);
			if (index == range) {
				return answer;
			}
			
		}
		
	}

	private int check(final String[] place) {
		Map<String, Boolean> partitionPos = new HashMap<>();
		int row = 0;
		int range = place.length;
		int result = 0;
		String room = null;
		do {
			room = place[row];
			if (room.indexOf("P") == -1) {
				if (room.indexOf("X") > -1) {
					putPartition(room, row, partitionPos);
				}
				continue;
			}
			
			result = search(place, room, row, partitionPos);
			if (result == 0) {
				return 0;
			}
		} while(++row < range);
			
		return 1;
	}
	
	private void putPartition(String room, int row, Map<String, Boolean> partitionPos) {
		int col = 0;
		int range = room.length();
		char at = 0;
		String key = null;
		do { 
			at = room.charAt(col);
			if (at == 'X') {
				key = getKey(row, col);
				if (key == null) {
					partitionPos.put(key, true);
				}
			}
		} while(++col < range);
	}

	private int search(String[] rooms, String room, int row, Map<String, Boolean> partitionPos) {
		char[] el = room.toCharArray();
		int col = 0;
		int range = el.length;
		char current = 0_0;
		int temp = 0;
		while(col < range) {
			current = el[col];
			if (current == 'X') {
				partitionPos.put(getKey(row, col), true);
				col++;
				continue;
			} 
			
			if (current != 'P') {
				col++;
				continue;
			}
			
			System.out.print("시작:");
			System.out.println(getKey(row, col) + " = " + current);
			
			if (col > 0) {

				temp = horizontalSearch(rooms, el, row, col, false, partitionPos);
				if (temp == 0) {
					return 0;
				}
			}
			
			if (col < range - 1) {
				temp = horizontalSearch(rooms, el, row, col, true, partitionPos);
				if (temp == 0) {
					return 0;
				}
			}
			
			if (row > 0) {
				temp = verticalSearch(rooms, row, col, true, partitionPos, 0);
				if (temp == 0) {
					return 0;
				}
			} 
			
			if (row < 5) {
				temp = verticalSearch(rooms, row, col, false, partitionPos, 0);
				if (temp == 0) {
					return 0;
				}
			}
			
			col++;
		}
		return 1;
	}
	
	private int verticalSearch(String[] rooms, int row, int col, boolean flag, Map<String, Boolean> partitionPos, int count) {
		char temp = 0;
		while(true) {
			if (count == 2 || (flag ? row - 1 < 0 : row + 1 > 4)) {
				return 1;
			}

			count++;
			temp = rooms[flag ? --row : ++row].charAt(col);
			System.out.println((!flag ? "▽" : "▲") + getKey(row, col) + " = " + temp);
			if(count == 2 && temp == 'P') {
				return partitionPos.get(getKey((flag? row + 1 : row - 1), col)) != null ? 1: 0;
			} else  if (temp == 'P') {
				return 0;
			} 
			
			if (temp == 'X') {
				partitionPos.put(getKey(row, col), true);
			}
		}
	}
	
	private int horizontalSearch(String[] rooms, char[] el, int row, int col, boolean flag, Map<String, Boolean> partitionPos) {
		char temp = 0;
		int count = 0;
		while(true) {
			if (count == 2 || (flag ? col + 1 > 4 : col - 1 < 0)) {
				return 1;
			}

			count++;
			temp = el[flag? ++col : --col];
			System.out.println((flag ? "▷" : "◀") + getKey(row, col) + " = " + temp);
			if(count == 2 && temp == 'P') {
				return partitionPos.get(getKey(row, (flag? col - 1 : col + 1))) != null ? 1 : 0;
			}
			
			if (temp == 'P') {
				return 0;
			} 
			
			if (temp == 'X') {
				partitionPos.put(getKey(row, col), true);
			}
			
			if (count == 1 && row > 0) {
				temp = (char) verticalSearch(rooms, row, col, true, partitionPos, 1);
				if (temp == 0) {
					return 0;
				}
			} 
			
			if (count == 1 && row < 5) {
				temp = (char) verticalSearch(rooms, row, col, false, partitionPos, 1);
				if (temp == 0) {
					return 0;
				}
			}
		}
	}

	private String getKey(int row, int col) {
		return String.format("%d_%d", row, col);
	}
}
