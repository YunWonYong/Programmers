public class Solution {
  public int solution(int n) {
    return String.valueOf(n)
      .chars()
      .map(x -> Integer.parseInt(String.valueOf((char) x)))
      .reduce(0, (acc, x) -> acc + x);
  }
}
