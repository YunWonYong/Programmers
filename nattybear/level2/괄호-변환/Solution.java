import java.util.ArrayList;
import java.util.Stack;

class Solution {
  public String solution(String p) {
    return toValid(p);
  }

  static int count(String s, char c) {
    int n = 0;
    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) == c)
        n++;
    return n;
  }

  static boolean balance(String p) {
    int open = count(p, '(');
    int close = count(p, ')');
    return open == close;
  }

  static boolean valid(String p) {
    CStack stack = new CStack();
    for (int i = 0; i < p.length(); i++)
      stack.puyo(p.charAt(i));
    return stack.empty();
  }

  static ArrayList<String> split(String u) {
    String v = u.substring(0, 2);
    String w = u.substring(2);
    return _split(v, w);
  }

  static ArrayList<String> _split(String v, String w) {
    if (balance(v) || w.length() == 0) {
      ArrayList<String> list = new ArrayList<>();
      list.add(v);
      list.add(w);
      return list;
    }
    String head = v.concat(w.substring(0, 2));
    String tail = w.substring(2);
    return _split(head, tail);
  }

  static String toValid(String w) {
    if (w.length() == 0 || valid(w))
      return w;

    ArrayList<String> list = split(w);
    String u = list.get(0);
    String v = list.get(1);

    if (valid(u))
      return u.concat(toValid(v));

    StringBuilder builder = new StringBuilder();
    builder.append("(");
    builder.append(toValid(v));
    builder.append(")");
    builder.append(stripFlip(u));
    return builder.toString();
  }

  static String stripFlip(String s) {
    int n = s.length();
    int[] xs = strip(s)
      .chars()
      .map(Solution::flip)
      .toArray();
    return new String(xs, 0, xs.length);
  }

  static String strip(String s) {
    int n = s.length();
    return s.substring(1, n-1);
  }

  static int flip(int p) {
    if ((char) p == '(')
      return (int) ')';
    else
      return (int) '(';
  }
}

class CStack extends Stack<Character> {
  void puyo(Character value) {
    if (empty()) {
      push(value);
      return;
    }
    switch (value) {
      case '(':
        push(value);
        break;
      case ')':
        if (peek() == '(')
          pop();
        else
          push(value);
    }
  }
}
