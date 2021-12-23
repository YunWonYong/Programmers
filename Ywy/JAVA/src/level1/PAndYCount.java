package level1;

public class PAndYCount {
    public boolean solution(String s) {
        s = s.toUpperCase();
        int yCount = s.replaceAll("[^P]", "").length();
        int pCount = s.replaceAll("[^Y]", "").length();
        return yCount == pCount;
    }
}
