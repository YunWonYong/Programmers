class Solution {
  public long solution(long n) {

    double m = Math.sqrt(n);

    if (m % 1 == 0) {
      long x = (long) m + 1;
      return x * x;

    } else {
      return -1;
    }
  }
}
