import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] arr) {
    IntStream stream = Arrays.stream(arr);
    int min = stream.min().getAsInt();
    int[] answer = stream.filter(x -> x != min).toArray();
    if (answer.length == 0)
      return new int[] {-1};
    else
      return answer;
  }
}
