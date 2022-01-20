import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public long solution(long n) {
    ArrayList<Integer> digits = toDigits(n);
    Collections.reverse(digits);
    return toNumber(digits);
  }

  static ArrayList<Integer> toDigits(long n) {
    ArrayList<Integer> digits = new ArrayList<>();

    while (n > 0) {
      int remainder = (int) (n % 10);
      digits.add(remainder);
      n = n / 10;
    }

    return digits;
  }

  static long toNumber(ArrayList<Integer> digits) {
    long sum = 0;

    for (int i = 0; i < digits.size(); i++)
      sum += digits.get(i) * (int) Math.pow(10, digits.size() - i + 1);

    return sum;
  }
}
