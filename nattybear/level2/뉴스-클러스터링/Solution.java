import java.util.*;

class Solution {
  static List<String> multiset(String s) {
    List<String> list = new ArrayList<>();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < s.length()-1; i++) {
      builder.append(s.charAt(i));
      builder.append(s.charAt(i+1));
      list.add(builder.toString());
      builder = new StringBuilder();
    }
    return list;
  }
}
