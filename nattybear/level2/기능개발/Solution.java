import java.util.ArrayList;

class Ints extends ArrayList<Integer> {}

class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    return group(zip(progresses, speeds));
  }

  static int[] zip(int[] progresses, int[] speeds) {
    int size = speeds.length;
    int[] xs = new int[size];
    for (int i = 0; i < size; i++) {
      int p = progresses[i];
      int s = speeds[i];
      int x = days(p, s);
      xs[i] = x;
    }
    return xs;
  }

  static int days(int progress, int speed) {
    int todo = 100 - progress;
    int quotient = todo / speed;
    int remainder = todo % speed;
    if (remainder == 0)
      return quotient;
    else
      return quotient + 1;
  }

  static int[] group(int[] xs) {
    Ints zs = new Ints();
    Ints ys = new Ints();
    for (int i = 0; i < xs.length; i++) {
      int x = xs[i];
      if (ys.size() == 0) {
        ys.add(x);
        continue;
      }
      if (ys.get(0) >= x) {
        ys.add(x);
      }
      else {
        zs.add(ys.size());
        ys.clear();
        ys.add(x);
      }
    }
    zs.add(ys.size());
    return zs.stream().mapToInt(x -> x).toArray();
  }
}
