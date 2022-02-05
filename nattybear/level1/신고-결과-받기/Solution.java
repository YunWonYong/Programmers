import java.util.*;

class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    Graph graph = new Graph();

    for (String id : id_list)
      graph.put(id, new Edge());

    String[][] pairs = Arrays
      .stream(report)
      .map(x -> x.split(" "))
      .toArray(String[][]::new);

    for (String[] pair : pairs)
      graph.get(pair[1]).add(pair[0]);

    return new int[] {};
  }
}

class Edge {
  private HashSet<String> edge;

  public void add(String id) {
    edge.add(id);
  }
}

class Graph {
  private HashMap<String,Edge> graph;

  public void put(String key, Edge value) {
    graph.put(key, value);
  }

  public Edge get(String key) {
    return graph.get(key);
  }
}
