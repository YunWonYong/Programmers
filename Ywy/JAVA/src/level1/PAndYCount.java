package level1;

public class PAndYCount {
	public boolean solution(final String s) {
		int pCount = s.replaceAll("[^pP]", "").length();
		int yCount = s.replaceAll("[^yY]", "").length();
		return pCount == yCount;
	}
}
