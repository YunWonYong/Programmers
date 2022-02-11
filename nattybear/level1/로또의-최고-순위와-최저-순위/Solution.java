import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    long corrects = Arrays.stream(lottos)
      .filter(x -> IntStream.of(win_nums).anyMatch(y -> y == x))
      .count();
    long zeros = Arrays.stream(lottos)
      .filter(x -> x == 0)
      .count();
    int high = rank(corrects + zeros);
    int low = rank(corrects);
    return new int[] {high, low};
  }

  static int rank(long corrects) {
    int ranking = 0;
    switch ((int) corrects) {
      case 6:
        ranking = 1;
        break;
      case 5:
        ranking = 2;
        break;
      case 4:
        ranking = 3;
        break;
      case 3:
        ranking = 4;
        break;
      case 2:
        ranking = 5;
        break;
      default:
        ranking = 6;
    }
    return ranking;
  }
}
