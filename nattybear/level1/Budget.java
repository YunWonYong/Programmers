package nattybear.level1;

import java.util.Arrays;

class Solution {
  public int solution(int[] d, int budget) {

    int sum = 0;
    int num = 0;

    Arrays.sort(d);

    for (int e : d) {
      sum += e;
      if (sum <= budget) {
        num++;
      } else {
        break;
      }
    }

    return num;
  }
}

public class Budget {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(new int[] {1,3,2,5,4}, 9));
    System.out.println(s.solution(new int[] {2,2,3,3}, 10));
  }
}
