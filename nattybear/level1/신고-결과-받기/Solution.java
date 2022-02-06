import java.util.*;

class Reporters extends HashSet<String> {}

class Graph extends HashMap<String,Reporters> {
}

class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    Graph graph = new Graph();

    for (String id : id_list)
      graph.put(id, new Reporters());

    for (String line : report) {
      String[] pair = line.split(" ");
      String id = pair[1];
      String reporter = pair[0];
      graph.get(id).add(reporter);
    }

    return new int[] {};
  }
}

class Counter extends HashMap<String,Integer> {
  public Counter(String[] id_list) {
    super();
    for (String id : id_list)
      super.put(id, 0);
  }

  public void add(String id) {
    int current = super.get(id);
    int new_current = current + 1;
    super.put(id, new_current);
  }
}
