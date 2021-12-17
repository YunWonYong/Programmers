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
