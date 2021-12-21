class Solution {
  boolean solution(String s) {
    int p = 0;
    int y = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = Character.toLowerCase(s.charAt(i));
      if (c == 'p')
        p++;
      else if (c == 'y')
        y++;
    }
    return p == y;
  }
}
