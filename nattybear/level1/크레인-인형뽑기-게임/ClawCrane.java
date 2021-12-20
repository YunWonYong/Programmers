package nattybear.level1;

import java.util.ArrayList;
import java.util.Optional;

public class ClawCrane {
  public int solution(int[][] board, int[] moves) {

    int size = board.length;

    Board aBoard = new Board(board);
    Crane crane = new Crane();
    Basket basket = new Basket(size * size);

    for (int n : moves) {
      crane.move(aBoard, n, basket);
    }

    return basket.getNumberOfRemoved();
  }
}

class Stack {
  protected ArrayList<Doll> dolls;

  public Stack(int size) {
    dolls = new ArrayList<Doll>(size);
  }

  public void push(Doll doll) {
    dolls.add(doll);
  }

  public Optional<Doll> pop() {
    int i = dolls.size() - 1;

    if (i == -1)
      return Optional.empty();

    Doll doll = dolls.get(i);
    dolls.remove(i);

    return Optional.of(doll);
  }

  public String toString() {
    return dolls.toString();
  }
}

class Board {
  private ArrayList<Stack> stacks;

  public Board(int[][] board) {
    int size = board.length;
    stacks = new ArrayList<Stack>(size);

    for (int i = 0; i < size; i++) {
      Stack stack = new Stack(size);

      for (int j = size-1; j >= 0; j--) {
        int shape = board[j][i];

        if (shape == 0)
          continue;

        Doll doll = new Doll(shape);
        stack.push(doll);
      }
      stacks.add(stack);
    }
  }

  public Stack getStack(int n) {
    return stacks.get(n - 1);
  }
}

class Doll {
  private int shape;

  public Doll(int s) {
    shape = s;
  }

  public int getShape() {
    return shape;
  }

  public String toString() {
    return "Doll " + shape;
  }

  public boolean equals(Object o) {
    return shape == ((Doll) o).getShape();
  }
}

class Crane {
  public void move(Board board, int n, Basket basket) {
    Stack stack = board.getStack(n);
    Optional<Doll> doll = stack.pop();
    basket.push(doll);
  }
}

class Basket extends Stack {
  private int numberOfRemoved = 0;

  public Basket(int size) {
    super(size);
  }

  public void push(Optional<Doll> doll) {
    if (!doll.isPresent())
      return;

    int i = dolls.size() - 1;

    if (i == -1) {
      super.push(doll.get());
      return;
    }

    Doll top = dolls.get(i);

    if (top.equals(doll.get())) {
      numberOfRemoved += 2;
      pop();

    } else {
      super.push(doll.get());
    }
  }

  public int getNumberOfRemoved() {
    return numberOfRemoved;
  }
}
