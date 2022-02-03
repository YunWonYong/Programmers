class Solution {
  public int solution(int num) {
    long len = collatz(num);
    return (len < 500) ? (int) len : -1;
  }

  static long collatz(long x) {
    if (x == 1)
      return 0;

    long y = (x % 2 == 0) ? x / 2 : x*3 + 1;

    return 1 + collatz(y);
  }
}
