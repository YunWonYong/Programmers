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

  public Pair[] makePairs() {
    Pair[] pairs = new Pair[graph.size()];
  }

  public static Pair[] zip(String[] id, Edge edge) {
  }
}

class Pair {
  private String id;
  private int count;

  public Pair(String id, int count) {
    this.id = id;
    this.count = count;
  }

  public String fst() {
    return id;
  }

  public int snd() {
    return count;
  }
}

class Counter {
  private HashMap<String,Integer> counter;

  public Counter(String[] id_list) {
    counter = new HashMap<>();
    Arrays.stream(id_list).map(x -> counter.put(x, 0));
  }
}
