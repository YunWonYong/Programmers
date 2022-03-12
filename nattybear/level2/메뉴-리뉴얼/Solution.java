import java.util.*;
import java.util.stream.*;

class Solution {
  public String[] solution(String[] orders, int[] courses) {
    Counter counter = new Counter();

    for (int course : courses) {
      for (String order : orders) {
        Order ord = new Order(order);
        List<String> combinations = ord.generate(course);
        for (String combination : combinations)
          counter.count(combination);
      }
    }

    Max max = new Max();

    for (int course : courses) {
      max.put(course, 0);
      counter.forEach((k, v) -> {
        if (k.length() == course)
          if (max.get(course) < v)
            max.put(course, v);
      });
    }

    Stream.Builder builder = Stream.builder();

    for (int course : courses) {
      counter.forEach((k, v) -> {
        if (v > 1 && k.length() == course && v == max.get(course))
          builder.add(k);
      });
    }

    return (String[]) builder.build().sorted().toArray(String[]::new);
  }
}

class Order {
  String order;

  Order(String order) {
    this.order = order;
  }

  void helper(List<String> combinations,
              char[] data,
              int start,
              int end,
              int index) {
    if (index == data.length) {
      char[] newData = data.clone();
      Arrays.sort(newData);
      String combination = new String(newData);
      combinations.add(combination);

    } else if (start <= end) {
      data[index] = order.charAt(start);
      helper(combinations, data, start+1, end, index+1);
      helper(combinations, data, start+1, end, index);
    }
  }

  List<String> generate(int r) {
    List<String> combinations = new ArrayList<>();
    helper(combinations, new char[r], 0, order.length()-1, 0);
    return combinations;
  }
}

class Counter extends HashMap<String, Integer> {
  void count(String combination) {
    if (get(combination) == null)
      put(combination, 1);
    else
      put(combination, get(combination) + 1);
  }
}

class Max extends HashMap<Integer, Integer> {}
