import java.util.*;
import java.util.stream.*;

class Solution {
  public int solution(String s) {
    Robot robot = new Robot(2);
    robot.split(s.toCharArray());
    System.out.println(robot.getList());
    return 0;
  }
}

class Robot {
  private int n;
  private StringBuilder builder;
  private ArrayList<String> list;

  public Robot(int n) {
    this.n = n;
    builder = new StringBuilder();
    list = new ArrayList<>();
  }

  public String compress(String s) {
    split(s.toCharArray());
    return list
      .stream()
      .map(x -> count(x))
      .collect(Collectors.joining());
  }

  public void split(char[] s) {
    if (s.length == 0)
      return;
    char[] fst = Util.take(n, s);
    char[] tail = Util.drop(n, s);
    char[] snd = Util.take(n, tail);
    if (Arrays.equals(fst, snd)) {
      builder.append(fst);
      split(tail);
    } else {
      builder.append(fst);
      list.add(builder.toString());
      builder = new StringBuilder();
      split(tail);
    }
  }

  public String count(String s) {
    char[] c = Util.take(n, s.toCharArray());
    int len = s.length();
    if (len == 1)
      return String.valueOf(c);
    return String.valueOf(len) + String.valueOf(c);
  }

  public ArrayList<String> getList() {
    return list;
  }
}

class Util {
  public static char[] take(int n, char[] s) {
    if (s.length <= n)
      return s;
    char[] t = new char[n];
    for (int i = 0; i < n; i++)
      t[i] = s[i];
    return t;
  }

  public static char[] drop(int n, char[] s) {
    if (s.length <= n)
      return new char[] {};
    int newLength = s.length - n;
    char[] t = new char[newLength];
    int j = n;
    for (int i = 0; i < newLength; i++)
      t[i] = s[j++];
    return t;
  }
}
