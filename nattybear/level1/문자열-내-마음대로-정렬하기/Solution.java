import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public String[] solution(String[] strings, int n) {
    return Arrays
      .stream(strings)
      .sorted(new Comparator<String>() {
        public int compare(String s1, String s2) {
          char c1 = s1.charAt(n);
          char c2 = s2.charAt(n);
          int result = c1 - c2;
          if (result != 0)
            return result;
          else
            return s1.compareTo(s2);
        }
      })
      .toArray(String[]::new);
  }
}
