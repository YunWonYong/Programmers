package nattybear.level1;

import java.util.stream.IntStream;

class Solution {
  public int solution(int left, int right) {
    IntStream stream = IntStream.range(left, right+1);
    return stream
      .map(x -> even(numOfDiv(x)) ? x : -x)
      .sum();
  }

  int numOfDiv(int n) {
    int num = 1;
    for (int i = 2; i <= n; i++)
      if (n % i == 0)
        num++;
    return num;
  }

  boolean even(int n) {
    return n % 2 == 0;
  }
}

public class SumDiv {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(13, 17));
    System.out.println(s.solution(24, 27));
  }
}
