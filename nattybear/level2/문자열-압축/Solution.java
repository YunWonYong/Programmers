class Solution {
  public int solution(String s) {
    return 0;
  }
}

class Util {
  static char[] take(int n, char[] s) {
    if (s.length <= n)
      return s;
    char[] t = new char[n];
    for (int i = 0; i < n; i++)
      t[i] = s[i];
    return t;
  }

  static char[] drop(int n, char[] s) {
    if (s.length <= n)
      return new char[] {};
    int newLength = s.length - n;
    char[] t = new char[newLength];
    int j = n;
    for (int i = 0; i < newLength; i++)
      t[i] = s[j++];
    return t;
  }
}
