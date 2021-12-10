package nattybear.level1;

import java.util.ArrayList;
import java.util.regex.*;

class Solution {
  public int solution(String dartResult) {
    String s = "\\d{1,2}[SDT][*#]{0,1}";
    Pattern p = Pattern.compile(s);
    Matcher m = p.matcher(dartResult);

    ArrayList<Chance> chances = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      m.find();
      Chance chance = new Chance(m.group());
      chance.applyBonus();
      chances.add(chance);
    }

    for (int i = 0; i < 3; i++) {
      Chance chance = chances.get(i);
      if (chance.getOption().equals("*")) {
        chance.setScore(chance.getScore() * 2);
        if (i == 0) continue;
        Chance prev = chances.get(i-1);
        prev.setScore(prev.getScore() * 2);

      } else if (chance.getOption().equals("#")) {
        chance.setScore(chance.getScore() * -1);
      }
    }

    int sum = 0;
    for (Chance chance : chances)
      sum += chance.getScore();

    return sum;
  }
}

class Chance {
  private int score;
  private String bonus;
  private String option;

  public Chance(String s) {
    Pattern p = Pattern.compile("(\\d{1,2})([SDT])([*#]{0,1})");
    Matcher m = p.matcher(s);
    m.find();
    score = Integer.parseInt(m.group(1));
    bonus = m.group(2);
    option = m.group(3);
  }

  public int getScore() {
    return score;
  }

  public void setScore(int s) {
    score = s;
  }

  public String getOption() {
    return option;
  }

  public void applyBonus() {
    int n = 1;
    if (bonus.equals("D")) {
      n = 2;
    } else if (bonus.equals("T")) {
      n = 3;
    }
    score = (int) Math.pow(score, n);
  }
}

public class Dart {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution("1S2D*3T"));
  }
}
