package nattybear.level1;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] xs, int d) {
    int[] ys = go(xs, d);
    if (ys.length == 0)
      return new int[] {-1};
    Arrays.sort(ys);
    return ys;
  }

  public int[] go(int[] xs, int d) {
    return Arrays
      .stream(xs)
      .filter(x -> x % d == 0)
      .toArray();
  }
}

public class Divisor {
  public static void main(String[] args) {
    Solution s = new Solution();

    System.out.println(
      Arrays.toString(
        s.solution(new int[] {5, 9, 7, 10}, 5)));

    System.out.println(
      Arrays.toString(
        s.solution(new int[] {2, 36, 1, 3}, 1)));

    System.out.println(
      Arrays.toString(
        s.solution(new int[] {3, 2, 6}, 10)));
  }
}
