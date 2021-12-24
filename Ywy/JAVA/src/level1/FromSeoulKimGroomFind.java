package level1;

import semantics.Choice;

public class FromSeoulKimGroomFind {
	
	public String solution(final String[] seoul) {
		int left = 0;
        int right = seoul.length - 1;
        int pos = -1_0_0;
        while(true) {
            if (seoul[left++].equals("Kim")) {
                pos = left - 1;
            } else if (seoul[right--].equals("Kim")) {
                pos = right + 1;
            }
            if (pos > -1) {
            	return String.format("김서방은 %d에 있다", pos);
            }
        }
	}
	
	public String solution2(String[] seoul) {
        final String KIM = "Kim";
        int left = 0;
        int right = seoul.length - 1;
        int mid = (left + right) / 2;
        int pos = -1_0_0;
        while(true) {
            if (KIM.equals(seoul[mid])) {
                pos = mid;
            } else if (KIM.equals(seoul[left])) {
                pos = left;
            } else if (KIM.equals(seoul[right])) {
                pos = right;
            } 
            if (pos > -1) {
            	return String.format("김서방은 %d에 있다", pos);
            }
            left++;
            right--;
            mid = (left + right) / 2;
        }
    }
	
	@Choice
	public String solution3(String[] seoul) {
        int left = -1;
        int right = seoul.length;
        int mid = 0_0;
        int pos = -1;
        while(true) {
        	left++;
        	right--;
        	mid = (left + right) / 2;
        	pos = find(seoul, left, mid, right);
            if (pos > -1) {
            	return String.format("김서방은 %d에 있다", pos);
            }
        }
    }
	
	// Arbitrary Number of Arguments: varargs
	private int find(final String[]seoul, final int... positions) { 
		final String KIM = "Kim";
		int index = 0;
		int range = positions.length;
		do {
			if (KIM.equals(seoul[positions[index]])) {
				return positions[index];
			}
		} while(++index < range);
		return -1;
	}
	
	public String solution4(String[] seoul) {
		return String.format("김서방은 %d에 있다", 
			java.util.Arrays.toString(seoul)
			.replaceAll("[^a-zA-Z,]", "")
			.replace("Kim", "#")
			.replaceAll("[^#,]{1,}", "@")
			.replaceAll("[,]", "")
			.indexOf("#")
		);
    }
}
