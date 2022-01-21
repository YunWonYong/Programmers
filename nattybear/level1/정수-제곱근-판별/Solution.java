class Solution {
  public long solution(long n) {
    long m = Math.sqrt(n);
    if (m.toString().contains('.'))
      return -1;
    else
      return Math.pow(m + 1, 2);
  }
}
