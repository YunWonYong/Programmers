package nattybear.level1;

class NumberStrToNumber {
	public int solution(String s) {
		int size = s.length();
		int cursor = 0;
		StringBuilder builder = new StringBuilder();

		while (cursor < size) {
			char c = s.charAt(cursor++);
			if (c >= '0' && c <= '9') {
				builder.append(c);
			} else if (c == 'o') {
				builder.append('1');
				cursor += 2;
			} else if (c == 't') {
				if (s.charAt(cursor++) == 'w') {
					builder.append('2');
					cursor++;
				} else {
					builder.append('3');
					cursor += 3;
				}
			} else if (c == 'f') {
				if (s.charAt(cursor++) == 'o') {
					builder.append('4');
					cursor += 2;
				} else {
					builder.append('5');
					cursor += 2;
				}
			} else if (c == 's') {
				if (s.charAt(cursor++) == 'i') {
					builder.append('6');
					cursor++;
				} else {
					builder.append('7');
					cursor += 3;
				}
			} else if (c == 'e') {
				builder.append('8');
				cursor += 4;
			} else if (c == 'n') {
				builder.append('9');
				cursor += 3;
			} else if (c == 'z') {
				builder.append('0');
				cursor += 3;
			}
		}

		return Integer.parseInt(builder.toString());
	}
}
