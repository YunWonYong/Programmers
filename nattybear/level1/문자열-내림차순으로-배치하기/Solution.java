class Solution {
  public String solution(String s) {
    int[] numbers = s
      .chars()
      .map(i -> -i)
      .sorted()
      .map(i -> -i)
      .toArray();
    return new String(numbers, 0, numbers.length);
  }
}
