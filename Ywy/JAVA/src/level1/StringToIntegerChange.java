package level1;

public class StringToIntegerChange {
	
	public StringToIntegerChange() {}
	
	public int solution(final String s) {
		int temp = Integer.parseInt(s.replaceAll("[^0-9]", ""));
		return s.indexOf("-") > -1 ? ~temp + 1 : temp;
	}
}
