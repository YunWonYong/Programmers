import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

class Xs extends ArrayList<Integer> {}

class Xxs extends ArrayList<Xs> {}

class Solution {
  public int[] solution(int rows, int columns, int[][] queries) {
    Matrix matrix = new Matrix(rows, columns);
    IntStream.Builder answer = IntStream.builder();
    Arrays.stream(queries).forEach(query -> {
      matrix.rotate(query);
      answer.add(matrix.min());
    });
    return answer.build().toArray();
  }
}

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point up() {
    return new Point(x - 1, y);
  }

  Point down() {
    return new Point(x + 1, y);
  }

  Point left() {
    return new Point(x, y - 1);
  }

  Point right() {
    return new Point(x, y + 1);
  }

  Point next(int[] query) {
    int x1 = query[0];
    int y1 = query[1];
    int x2 = query[2];
    int y2 = query[3];
    if (x == x1) {
      if (y == y2) {
        return down();
      }
      return right();
    }
    if (y == y2) {
      if (x == x2) {
        return left();
      }
      return down();
    }
    if (x == x2) {
      if (y == y1) {
        return up();
      }
      return left();
    }
    if (y == y1) {
      if (x == x1) {
        return right();
      }
      return up();
    }
    return new Point(x, y);
  }
}

class Matrix {
  Xxs matrix;
  Xs border;

  Matrix(int row, int column) {
    matrix = new Xxs();
    makeMatrix(row, column);
    border = new Xs();
  }

  void makeMatrix(int row, int column) {
    int x = 1;
    Xs line = new Xs();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        line.add(x);
        x++;
      }
      matrix.add(line);
      line = new Xs();
    }
  }

  int get(Point p) {
    return matrix.get(p.x - 1).get(p.y - 1);
  }

  void set(Point p, int value) {
    matrix.get(p.x - 1).set(p.y - 1, value);
  }

  void move(Point p, int[] query) {
    int value = get(p);
    set(p, 0);
    Point q = p.next(query);
    if (get(q) != 0)
      move(q, query);
    set(q, value);
    border.add(value);
  }

  void rotate(int[] query) {
    int x1 = query[0];
    int y1 = query[1];
    int x2 = query[2];
    int y2 = query[3];
    Point start = new Point(x1, y1);
    move(start, query);
  }

  int min() {
    int m = border
      .stream()
      .mapToInt(x -> x)
      .min()
      .getAsInt();
    border.clear();
    return m;
  }
}
