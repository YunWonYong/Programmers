package ywy.level1;

public class KeyPadPress {
	int[][] pad = {
		{ 1, 2, 3},
		{ 4, 5, 6},
		{ 7, 8, 9},
		{10, 0, 11}
	};
	
	public KeyPadPress() {}
	
	public String solution(final int[] numbers, final String hand) {
		StringBuffer answer = new StringBuffer();
		String leftPos = "3|0";
		String rightPos = "3|2";
		String movePos = null;
		int number = -1;
		int left = -1;
		int right = -1;
		int index = 0;
		int range = numbers.length;
		boolean flag = hand.equals("left");
		do {
			number = numbers[index];
			if (index == 5) {
				System.out.println("break;");
			}
			movePos = findTargetPos(number);
			left = check(leftPos, "left",number);
			right = check(rightPos, "right",number);
			if (left == right) {
				if (flag) {
					leftPos = movePos;
					answer.append("L");
					continue;
				}
				rightPos = movePos;
				answer.append("R");
				continue;
			} else if (right == -1 || left > -1 && left < right) {
				leftPos = movePos;
				answer.append("L");
				continue;
			}
			rightPos = movePos;
			answer.append("R");
		} while((++index) < range);
		return answer.toString();
	}
	
	
	
	private int check(String pos, String direction, int number) {
		String[] yx = keySplit(pos);
		int y = strToInt(yx[0]);
		int x = strToInt(yx[1]);
		int result = up(y, x, direction, number);
		if (result == -1) {
			result = down(y, x, direction, number);
		}
		return result;
	}
	
	private int up(int y, int x, String direction, int number) {
		int temp = -1;
		int index = y;
		int[] row = null;
		do {
			row = pad[index];
			temp = direction.equals("left") ? left(row, x, number) : right(row, x, number);
			if (temp > -1) {
				return (index - y) + temp;
			}
		} while((++index) < pad.length);
		return -1;
	}
	
	private int down(int y, int x, String direction, int number) {
		int temp = -1;
		int index = y;
		int[] row = null;
		do {
			row = pad[index];
			temp = direction.equals("left") ? left(row, x, number) : right(row, x, number);
			if (temp > -1) {
				return (y - index) + temp;
			}
		} while((--index) > -1);
		return -1;
	}
	
	private int left(int[] row, int x, int number) {
		if (row[x] == number) {
			return 0;
		} else if (row[x == 1 ? 0 : 1] == number) {
			return 1;
		}
		return -1; 
	}
	
	private int right(int[] row, int x, int number) {
		if (row[x] == number) {
			return 0;
		} else if (row[x == 2 ? 1 : 2] == number) {
			return 1;
		}
		return -1; 
	}
	
	private String findTargetPos(int number) {
		int y = yLineSearch(number);
		if (y == -1) {
			return null;
		}
		int x = xLineSearch(pad[y], number);
		return x == -1 ? null : keyGen(y, x);
	}
	
	private int yLineSearch(int number) {
		int y = 0;
		int x = 0;
		int range = pad.length;
		do {
			x = xLineSearch(pad[y], number);
			if (x != -1) {
				return y;
			}
		} while((++y) < range);
		return -1;
	}
	
	private int xLineSearch(int[] row, int number) {
		int x = 0;
		int range = row.length;
		int padNumber = -1;
		do {
			padNumber = row[x];
			if (padNumber == number) {
				return x;
			}
		} while((++x) < range);
		return -1;
	}
	
	private String[] keySplit(String key) {
		return key.split("\\|");
	}
	
	private String keyGen(int y, int x) {
		return new StringBuffer().append(y).append("|").append(x).toString();
	}
	
	private int strToInt(final String str) {
		return Integer.parseInt(str);
	}
	
}
