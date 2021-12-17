package nattybear.level1;

import java.util.ArrayList;

class Solution {
  public int solution(int[][] sizes) {

    ArrayList<NameCard> cards = new ArrayList<>();

    for (int[] pair : sizes) {
      NameCard card = new NameCard(pair[0], pair[1]);
      cards.add(card);
    }

    int w = cards
      .stream()
      .map(x -> x.max())
      .reduce(Integer::max)
      .get();

    int h = cards
      .stream()
      .map(x -> x.min())
      .reduce(Integer::max)
      .get();

    return w * h;
  }
}

class NameCard {

  private int weight;
  private int height;

  NameCard(int w, int h) {
    weight = w;
    height = h;
  }

  int max() {
    return Math.max(weight, height);
  }

  int min() {
    return Math.min(weight, height);
  }
}

public class Rect {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] sizes = {
      {60, 50},
      {30, 70},
      {60, 30},
      {80, 40},
    };
    System.out.println(s.solution(sizes));
  }
}
