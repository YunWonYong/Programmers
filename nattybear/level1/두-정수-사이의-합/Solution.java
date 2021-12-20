import java.util.stream.LongStream;

class Solution {
  public long solution(int a, int b) {
    long min = Math.min(a, b);
    long max = Math.max(a, b);
    return LongStream 
      .range(min, max+1)
      .sum();
  }
}
