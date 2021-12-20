package nattybear.level1;

import java.util.*;

class Solution {
  public int[] solution(int[] array, int[][] commands) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int[] command : commands)
      list.add(helper(array, command));

    int[] answer = new int[list.size()];
    Arrays.setAll(answer, list::get);

    return answer;
  }

  int helper(int[] array, int[] command) {

    int i = command[0];
    int j = command[1];
    int k = command[2];

    int[] anArray = Arrays.copyOfRange(array, i-1, j);

    Arrays.sort(anArray);

    return anArray[k-1];
  }
}

public class KthNumber {
  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    Solution s = new Solution();
    int[] answer = s.solution(array, commands);

    for (int i : answer)
      System.out.println(i);
  }
}
