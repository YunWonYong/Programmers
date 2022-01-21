import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] arr) {
    Supplier<IntStream> supplier = () -> Arrays.stream(arr);
    int min = supplier.get().min().getAsInt();
    int[] answer = supplier.get().filter(x -> x != min).toArray();
    if (answer.length == 0)
      return new int[] {-1};
    else
      return answer;
  }
}
