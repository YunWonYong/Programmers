import java.util.*;

class Solution {
  public int solution(String str1, String str2) {
    double j = jaccard(str1.toUpperCase(), str2.toUpperCase());
    return (int) (j * 65536);
  }

  static double jaccard(String s, String t) {
    List<String> xs = multiset(s);
    List<String> ys = multiset(t);
    if (xs.size() == 0 && ys.size() == 0)
      return 1;
    List<String> intersection = intersect(xs, ys);
    List<String> union = unify(xs, ys);
    return (double) intersection.size() / union.size();
  }

  static List<String> multiset(String s) {
    List<String> list = new ArrayList<>();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < s.length()-1; i++) {
      char a = s.charAt(i);
      char b = s.charAt(i+1);
      if (!Character.isAlphabetic(a) || !Character.isAlphabetic(b))
        continue;
      builder.append(a);
      builder.append(b);
      list.add(builder.toString());
      builder = new StringBuilder();
    }
    return list;
  }

  static List<String> intersect(List<String> xs, List<String> ys) {
    Counter c = new Counter(xs);
    Counter d = new Counter(ys);
    return c.intersect(d).toList();
  }

  static List<String> unify(List<String> xs, List<String> ys) {
    Counter c = new Counter(xs);
    Counter d = new Counter(ys);
    c.unify(d);
    return c.toList();
  }
}

class Counter extends HashMap<String, Integer> {
  Counter() {}

  Counter(List<String> xs) {
    for (String x : xs)
      count(x);
  }

  void count(String s) {
    if (get(s) == null)
      put(s, 1);
    else
      put(s, get(s) + 1);
  }

  Counter intersect(Counter c) {
    Counter d = new Counter();
    forEach((k, v) -> {
      if (c.get(k) != null)
        d.put(k, Math.min(v, c.get(k)));
    });
    return d;
  }

  void unify(Counter c) {
    c.forEach((k, v) -> merge(k, v, Math::max));
  }

  List<String> toList() {
    List<String> xs = new ArrayList<>();
    forEach((k, v) -> {
      for (int i = 0; i < v; i++)
        xs.add(k);
    });
    return xs;
  }
}
