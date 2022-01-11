import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
  public String solution(String s) {
    String[] words = s.split(" ");
    return Stream.of(words)
      .map(Solution::convert)
      .collect(Collectors.joining(" "));
  }

  public static String convert(String s) {
    int size = s.length();
    char[] ch = new char[size];
    for (int i = 0; i < size; i++) {
      char c = s.charAt(i);
      ch[i] = (i % 2 == 0)
            ? Character.toUpperCase(c)
            : Character.toLowerCase(c);
    }
    return new String(ch, 0, size);
  }
}
