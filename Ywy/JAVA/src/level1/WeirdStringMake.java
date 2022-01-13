package level1;

public class WeirdStringMake {
	
	public WeirdStringMake() {}
	
	public String solution(final String s) {
		final StringBuffer BUFFER = new StringBuffer();
		String[] strArr = s.split(" ", -1);
		int index = 0;
		int range = strArr.length;
		while(true) {
			change(BUFFER, strArr[index++]);
			if (index == range) {
				return BUFFER.toString();
			}
			BUFFER.append(" ");
		}
	}
	
	private void change(final StringBuffer BUFFER, final String s) {
		int CHANGE_VALUE = 'A' / 2;
		char[] atArr = s.toCharArray();
		int index = 0;
		int range = atArr.length;
		char temp = '\u0000';
		while(index < range) {
			temp = atArr[index];
			temp += index % 2 == 0 ? -CHANGE_VALUE : +CHANGE_VALUE;
			if (temp > 64 && temp < 123) {
				atArr[index] = temp;
			}
			index++;
		}
		BUFFER.append(atArr);
	}
}
