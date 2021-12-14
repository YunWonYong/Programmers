package nattybear.level1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Optional;

class Solution {
  public int[] solution(int[] xs) {
    ArrayList<Integer> ys = new ArrayList<>();
    for (int x : xs) {
      Optional<Integer> y = last(ys);
      try {
        if (y.get() != x)
          ys.add(x);

      } catch(Exception e) {
          ys.add(x);
      }
    }
    int[] zs = new int[ys.size()];
    for (int i = 0; i < ys.size(); i++)
      zs[i] = ys.get(i);
    return zs;
  }

  public Optional<Integer> last(ArrayList<Integer> xs) {
    if (xs.size() == 0)
      return Optional.empty();
    else
      return Optional.of(xs.get(xs.size() - 1));
  }
}

public class Unique {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(
      Arrays.toString(
        s.solution(new int[] {1, 1, 3, 3, 0, 1, 1})));

    System.out.println(
      Arrays.toString(
        s.solution(new int[] {4, 4, 4, 3, 3})));
  }
}
