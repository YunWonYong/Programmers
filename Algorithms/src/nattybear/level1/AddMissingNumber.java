import java.util.Arrays;

class Solution {
  public int solution(int[] numbers) {

    int sum = Arrays.stream(numbers)
      .reduce(0, (a, b) -> a + b);

    return 45 - sum;
  }
}
