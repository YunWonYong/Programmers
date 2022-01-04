class Solution {
  public boolean solution(String s) {
    return fourOrSix(s) && allDigit(s);
  }

  boolean fourOrSix(String s) {
    int size = s.length();
    return size == 4 || size == 6;
  }

  static boolean digit(int c) {
    return '0' <= c && c <= '9';
  }

  boolean allDigit(String s) {
    return s.chars().allMatch(Solution::digit);
  }
}
