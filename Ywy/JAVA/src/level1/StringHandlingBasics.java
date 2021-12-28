package level1;

public class StringHandlingBasics {
	public boolean solution(String s)  {
		try {
			switch (s.length()) {
			case 4:
			case 6:
				Integer.parseInt(s);
				return true;
			default:
				throw new Exception("4, 6 글자만 검사함.");
			}
		}catch (Exception e) {
			return false;
		}
	}
}
