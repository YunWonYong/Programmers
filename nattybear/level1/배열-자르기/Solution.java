import java.util.ArrayList;
import java.util.stream.LongStream;

class Solution {
  public int[] solution(int n, long left, long right) {
    ArrayList<Integer> list = new ArrayList<>();
    int remainder = (int) (left % n);
    long limit = (right - left + 1) + remainder;
    long cnt = 0;
    for (int i = row(n, left); i <= n; i++) {
      int j = 1;
      for (; j <= i; j++) {
        list.add(i);
        cnt++;
        if (cnt == limit)
          return list.stream()
            .mapToInt(Integer::intValue)
            .skip(remainder).toArray();
      }
      for (; j <= n; j++) {
        list.add(j);
        cnt++;
        if (cnt == limit)
          return list.stream()
            .mapToInt(Integer::intValue)
            .skip(remainder).toArray();
      }
    }
    return list.stream()
      .mapToInt(Integer::intValue)
      .toArray();
  }

  static int row(int n, long left) {
    long _row = left / (long) n + 1;
    return (int) _row;
  }
}
