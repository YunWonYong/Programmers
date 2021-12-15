package nattybear.level;

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

public class SumTwo {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(3, 5));
    System.out.println(s.solution(3, 3));
    System.out.println(s.solution(5, 3));
  }
}
