class Solution {
  public int[] solution(long n) {
    return String.valueOf(n)
      .chars()
      .map(x -> Integer.parseInt(String.valueOf((char) x)) * -1)
      .sorted()
      .map(x -> x * -1)
      .toArray();
  }
}
