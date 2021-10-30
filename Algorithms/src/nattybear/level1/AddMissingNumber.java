package nattybear.level1;

import java.util.Arrays;

class AddMissingNumber {

  public int solution(int[] numbers) {

    int sum = Arrays.stream(numbers)
      .reduce(0, (a, b) -> a + b);

    return 45 - sum;
  }
}
