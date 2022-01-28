import java.util.ArrayList;

class Solution {
  public boolean solution(int x) {
    int sum = toDigits(x).stream().reduce(0, (acc, n) -> acc + n);
    return x % sum == 0;
  }

  static ArrayList<Integer> toDigits(int x) {
    ArrayList<Integer> digits = new ArrayList<>();
    while (x > 0) {
      digits.add(x % 10);
      x = x / 10;
    }
    return digits;
  }
}
