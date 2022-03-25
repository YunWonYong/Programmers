import java.util.*;
import java.util.stream.*;

class Solution {
  public int[] solution(String s) {
    Calculator calculator = new Calculator(s);
    List<Integer> answer = new ArrayList<>();
    List<Set<Integer>> list = calculator.getSets();
    list
      .stream()
      .sorted((x, y) -> x.size() - y.size())
      .reduce(new HashSet<Integer>(), (acc, x) -> {
        Set<Integer> temp = new HashSet<>();
        temp.addAll(x);
        x.removeAll(acc);
        answer.add(x.iterator().next());
        return temp;
      });
    return answer.stream().mapToInt(x -> x).toArray();
  }
}

class Calculator {
  private String expression;
  private int current;
  private char look;

  public Calculator(String e) {
    expression = e;
    current = 0;
    getChar();
  }

  public void getChar() {
    if (current < expression.length())
      look = expression.charAt(current++);
  }

  public int getNum() {
    StringBuilder builder = new StringBuilder();
    while (Character.isDigit(look)) {
      builder.append(look);
      getChar();
    }
    return Integer.parseInt(builder.toString());
  }

  public Set<Integer> getSet() {
    Set<Integer> set = new HashSet<>();
    getChar();
    set.add(getNum());
    while (look != '}') {
      getChar();
      set.add(getNum());
    }
    getChar();
    return set;
  }

  public List<Set<Integer>> getSets() {
    List<Set<Integer>> sets = new ArrayList<>();
    getChar();
    sets.add(getSet());
    while (look != '}') {
      getChar();
      sets.add(getSet());
    }
    return sets;
  }
}
