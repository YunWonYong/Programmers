package level1;

public class StringDescending {
	public String solution(final String s) {
		final StringBuffer buffer = new StringBuffer();
		String[] patterns = new String[] {s.replaceAll("[A-Z]", ""), s.replaceAll("[^A-Z]", "")};
		String pattern = null;;
		int index = 0;
		while(true) {
			if (index == 2) {
				return buffer.toString();
			}
			pattern = patterns[index++];
			if (pattern == null || pattern.isEmpty() || pattern.isBlank()) {
				continue;
			}
			buffer.append(atDescSort(pattern));
		}
	}
	
	private char[] atDescSort(final String str) {
		int index = 0;
		int range = str.length();
		char[] arr = new char[range];
		arr[index] = str.charAt(index);
		while (++index < range) {
			arr[index] = str.charAt(index);
			if (arr[index - 1] > arr[index]) {
				continue;
			}
			insert(arr, index);
		}
		return arr;
	}
	
	private void insert(final char[] arr, int range) {
		char at = 0_0;
        boolean swapFlag = false;
		do {
			at = arr[range]; 
            swapFlag = false;
			if (at > arr[--range]) {
				arr[range + 1] = arr[range];
				arr[range] =  at;
                swapFlag = true;
			}
		} while(swapFlag && range > 0);
	}
}
