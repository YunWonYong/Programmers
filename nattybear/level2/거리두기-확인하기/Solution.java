import java.util.*;
import java.util.stream.*;

class Solution {
  public int[] solution(String[][] places) {
    List<Boolean> list = new ArrayList<>();
    for (String[] place : places) {
      Room room = new Room(place);
      boolean answer = room.safe();
      list.add(answer);
    }
    return list
      .stream()
      .mapToInt(x -> (x) ? 1 : 0)
      .toArray();
  }
}

class Room {
  char[][] seats = new char[5][5];

  Room(String[] place) {
    for (int i = 0; i < 5; i++)
      for (int j = 0; j < 5; j++)
        seats[i][j] = place[i].charAt(j);
  }

  List<Seat> getPersons() {
    List<Seat> list = new ArrayList<>();
    for (int i = 0; i < 5; i++)
      for (int j = 0; j < 5; j++)
        if (seats[i][j] == 'P')
          list.add(new Seat(i, j));
    return list;
  }

  boolean safe() {
    List<Seat> list = getPersons();
    return list 
      .stream()
      .allMatch(x -> x.allSafe());
  }

  class Seat {
    int row;
    int column;

    Seat(int r, int c) {
      row = r;
      column = c;
    }

    int distance(Seat s) {
      int rd = Math.abs(row - s.row);
      int cd = Math.abs(column - s.column);
      return rd + cd;
    }

    List<Seat> path(Seat s) {
      List<Seat> list = new ArrayList<>();
      if (row == s.row)
        list.add(new Seat(row, Math.min(column, s.column)+1));
      else if (column == s.column)
        list.add(new Seat(Math.min(row, s.row)+1, column));
      else {
        if (s.row < row && s.column < column) {
          list.add(up(1));
          list.add(left(1));
        } else if (s.row < row && column < s.column) {
          list.add(up(1));
          list.add(right(1));
        } else if (row < s.row && s.column < column) {
          list.add(down(1));
          list.add(left(1));
        } else {
          list.add(down(1));
          list.add(right(1));
        }
      }
      return list;
    }

    boolean safe(Seat s) {
      if (distance(s) == 1)
        return false;
      return path(s)
        .stream()
        .allMatch(x -> x.isPartition());
    }

    boolean allSafe() {
      List<Seat> list = surround();
      return list
        .stream()
        .filter(x -> x.isPerson())
        .allMatch(x -> safe(x));
    }

    boolean isPerson() {
      return seats[row][column] == 'P';
    }

    boolean isPartition() {
      return seats[row][column] == 'X';
    }

    List<Seat> surround() {
      List<Seat> list = new ArrayList<>();
      for (int i = 1; i <= 2; i++) {
        list.add(up(i));
        list.add(down(i));
        list.add(left(i));
        list.add(right(i));
      }
      list.add(up(1).left(1));
      list.add(up(1).right(1));
      list.add(down(1).left(1));
      list.add(down(1).right(1));
      return list
        .stream()
        .filter(x -> x.inRange())
        .collect(Collectors.toList());
    }

    boolean inRange() {
      return 0 <= row && row <= 4 && 0 <= column && column <= 4;
    }

    Seat up(int n) { return new Seat(row-n, column); }

    Seat down(int n) { return new Seat(row+n, column); }

    Seat left(int n) { return new Seat(row, column-n); }

    Seat right(int n) { return new Seat(row, column+n); }
  }
}
