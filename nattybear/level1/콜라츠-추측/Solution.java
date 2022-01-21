import java.util.stream.LongStream;

class Solution {
  public int solution(int num) {
    long len = collatz(num).count() - 1;
    return (len < 500) ? (int) len : -1;
  }

  static LongStream collatz(long x) {
    if (x == 1)
      return LongStream.of(1);

    long y = (x % 2 == 0) ? x / 2 : x*3 + 1;

    return LongStream.concat(LongStream.of(x), collatz(y));
  }
}
