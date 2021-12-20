package nattybear.level1;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
  public int[] solution(int N, int[] stages) {

    int[] answer = new int[N];

    ArrayList<Stage> theStages = new ArrayList<Stage>();

    for (int i = 0; i < N; i++) {
      Stage stage = new Stage(i+1);
      stage.count(stages);
      theStages.add(stage);
    }

    Collections.sort(theStages, Collections.reverseOrder());

    int i = 0;
    for (Stage stage : theStages) {
      answer[i++] = stage.getName();
    }

    return answer;
  }
}

class Stage implements Comparable<Stage> {
  private int name;
  private double failRate;

  public Stage(int number) {
    name = number;
  }

  int getName() {
    return name;
  }

  void count(int[] stages) {
    int challenger = 0;
    int notClear = 0;
    for (int stage : stages) {
      if (name < stage || name == stage) {
        challenger++;
      }
      if (name == stage) {
        notClear++;
      }
    }
    failRate = (double) notClear / (double) challenger;
  }

  double getFailRate() {
    return failRate;
  }

  @Override
  public int compareTo(Stage stage) {
    double aFailRate = stage.getFailRate();
    if      (failRate > aFailRate) return  1;
    else if (failRate < aFailRate) return -1;
    else {
      int aName = stage.getName();
      if      (name > aName) return -1;
      else if (name < aName) return  1;
      else                   return  0;
    }
  }
}

public class FailRate {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] answer = s.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
    for (int elem : answer)
      System.out.println(elem);
  }
}
