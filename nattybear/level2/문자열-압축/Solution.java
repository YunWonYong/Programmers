import java.util.*;
import java.util.stream.*;

class Solution {
  public int solution(String s) {
    if (s.length() == 1)
      return 1;
    ArrayList<Integer> list = new ArrayList<>();
    Robot robot;
    for (int i = 1; i < s.length(); i++) {
      robot = new Robot(i);
      list.add(robot.compress(s).length());
    }
    return Collections.min(list);
  }
}

class Car extends ArrayList<char[]> {}

class Train extends ArrayList<Car> {}

class Robot {
  private int n;
  private Car car;
  private Train train;

  public Robot(int n) {
    this.n = n;
    car = new Car();
    train = new Train();
  }

  public String compress(String s) {
    split(s.toCharArray());
    return train 
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
      car.add(fst);
      split(tail);
    } else {
      car.add(fst);
      train.add(car);
      car = new Car();
      split(tail);
    }
  }

  public String count(Car car) {
    char[] c = car.get(0);
    int len = car.size();
    if (len == 1)
      return String.valueOf(c);
    return String.valueOf(len) + String.valueOf(c);
  }

  public Train getTrain() {
    return train;
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
