class Solution {
  boolean solution(String s) {
    boolean answer = true;
    int p = 0;
    int y = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = Character.toLowerCase(s.charAt(i));
      if (c == 'p')
        p++;
      else if (c == 'y')
        y++;
    }
    if (p == y)
      return true;
    else
      return false;
  }
}
