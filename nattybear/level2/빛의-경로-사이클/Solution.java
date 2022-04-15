import java.util.*;

class Solution {
  public int[] solution(String[] grid) {
    Grid g = new Grid(grid);
    List<Integer> cycles = g.cycle();
    return cycles
      .stream()
      .mapToInt(x -> x)
      .filter(x -> x != 0)
      .sorted()
      .toArray();
  }
}

class Grid {
  int numRow;
  int numCol;
  Cell[][] grid;
  int lenCycle;
  List<Integer> cycles;

  Grid(String[] g) {
    numRow = g.length;
    numCol = g[0].length();
    grid = new Cell[numRow][numCol];
    for (int i = 0; i < numRow; i++)
      for (int j = 0; j < numCol; j++)
        grid[i][j] = new Cell(g[i].charAt(j), i, j);
    cycles = new ArrayList<>();
  }

  Cell getCell(int row, int col) {
    return grid[row][col];
  }

  List<Integer> cycle() {
    for (int i = 0; i < numRow; i++)
      for (int j = 0; j < numCol; j++)
        grid[i][j].cycle();
    return cycles;
  }

  class Cell {
    char type;
    int row;
    int col;
    Port east;
    Port west;
    Port south;
    Port north;

    Cell(char t, int r, int c) {
      type = t;
      row = r;
      col = c;
      east = new Port('E');
      west = new Port('W');
      south = new Port('S');
      north = new Port('N');
    }

    Cell up() {
      int newRow = row - 1;
      lenCycle++;
      if (newRow < 0)
        newRow = numRow - 1;
      return getCell(newRow, col);
    }

    Cell down() {
      int newRow = row + 1;
      lenCycle++;
      if (newRow >= numRow)
        newRow = 0;
      return getCell(newRow, col);
    }

    Cell left() {
      int newCol = col - 1;
      lenCycle++;
      if (newCol < 0)
        newCol = numCol - 1;
      return getCell(row, newCol);
    }

    Cell right() {
      int newCol = col + 1;
      lenCycle++;
      if (newCol >= numCol)
        newCol = 0;
      return getCell(row, newCol);
    }

    void cycle() {
      east.cycle();
      west.cycle();
      south.cycle();
      north.cycle();
    }

    class Port {
      char pos;
      boolean src;
      boolean dst;

      Port(char p) {
        pos = p;
        src = false;
        dst = false;
      }

      Port shoot() {
        Cell cell = null;
        Port port = null;
        switch (pos) {
          case 'E':
            cell = right();
            port = cell.west;
            break;
          case 'W':
            cell = left();
            port = cell.east;
            break;
          case 'S':
            cell = down();
            port = cell.north;
            break;
          case 'N':
            cell = up();
            port = cell.south;
        }
        src = true;
        port.dst = true;
        return port;
      }

      Port curve() {
        Port port = null;
        if (type == 'L') {
          switch (pos) {
            case 'E':
              port = south;
              break;
            case 'W':
              port = north;
              break;
            case 'S':
              port = west;
              break;
            case 'N':
              port = east;
          }
        }
        else if (type == 'R') {
          switch (pos) {
            case 'E':
              port = north;
              break;
            case 'W':
              port = south;
              break;
            case 'S':
              port = east;
              break;
            case 'N':
              port = west;
          }
        }
        else {
          switch (pos) {
            case 'E':
              port = west;
              break;
            case 'W':
              port = east;
              break;
            case 'S':
              port = north;
              break;
            case 'N':
              port = south;
          }
        }
        return port;
      }

      void cycle() {
        if (src) {
          cycles.add(lenCycle);
          lenCycle = 0;
          return;
        }
        shoot().curve().cycle();
      }
    }
  }
}
