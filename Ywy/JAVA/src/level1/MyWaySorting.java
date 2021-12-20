package level1;

public class MyWaySorting {
	public String[] solution(final String[] strings, final int n) {
		java.util.Arrays.sort(strings);
		int index = 0;
		int range = strings.length - 1;
		String str = null;
		String nextStr = null;
		while(index < range) { 
			str = strings[index++];
			nextStr = strings[index];
			if (str == null || nextStr == null) {
				break;
			} else if (str.charAt(n) > nextStr.charAt(n)) {
				strings[index] = str;
				strings[index - 1] = nextStr;
				index -= index > 1 ? 2 : 1;
				continue;
			}
		}
		return strings;
	}
}
