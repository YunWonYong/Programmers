import java.util.stream.LongStream;

class Solution {
  public long[] solution(int x, int n) {
    return LongStream
      .iterate(x, y -> y + x)
      .limit(n)
      .toArray();
  }
}
