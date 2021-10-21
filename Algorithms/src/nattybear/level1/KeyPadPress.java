import java.util.ArrayList;

class Solution {
  public String solution(int[] numbers, String hand) {
    Pad pad = new Pad();
    Hands hands = new Hands(hand);
    StringBuilder builder = new StringBuilder();

    for (int number : numbers) {
      Key key = pad.getKey(number);
      char h = hands.press(key);
      builder.append(h);
    }

    return builder.toString();
  }
}

class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int distance(Point p) {
    return Math.abs(x - p.getX()) + Math.abs(y - p.getY());
  }
}

class Key {
  private int name;
  private Point point;

  public Key(int n, Point p) {
    name = n;
    point = p;
  }

  public Point getPoint() {
    return point;
  }
}

class Pad {
  private ArrayList<Key> keys;

  public Pad() {
    int name = 1;
    keys = new ArrayList<Key>(10);

    Point point = new Point(3, 1);
    Key key = new Key(0, point);
    keys.add(key);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        point = new Point(i, j);
        key = new Key(name++, point);
        keys.add(key);
      }
    }
  }

  public Key getKey(int number) {
    return keys.get(number);
  }
}

class Hands {
  private String type;
  private Point left;
  private Point right;

  public Hands(String t) {
    type = t;
    left = new Point(3, 0);
    right = new Point(3, 2);
  }

  public char press(Key key) {
    char result = ' ';
    Point p = key.getPoint();

    switch (p.getY()) {
      case 0:
        left = p;
        result = 'L';
        break;
      case 2:
        right = p;
        result = 'R';
        break;
      case 1:
        result = calculate(p);
    }

    return result;
  }

  public char calculate(Point p) {
    int leftDistance = left.distance(p);
    int rightDistance = right.distance(p);

    if (leftDistance < rightDistance) {
      left = p;
      return 'L';
    }

    if (leftDistance > rightDistance) {
      right = p;
      return 'R';
    }

    if (type.equals("left")) {
      left = p;
      return 'L';
    }

    right = p;
    return 'R';
  }
}
