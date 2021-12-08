import java.util.ArrayList;

class Solution {
  public String[] solution(int n, int[] xs, int[] ys) {
    int[] zs = zip(n, xs, ys);
    Row row = new Row(zs);
    String[] answer = new String[n];

    for (int i = 0; i < n; i++) {
      String s = row
        .getRow()
        .get(i)
        .toString();
      answer[i] = padding(s, n);
    }

    return answer;
  }

  public int[] zip(int n, int[] xs, int[] ys) {
    int[] zs = new int[n];
    for (int i = 0; i < n; i++) {
      int x = xs[i];
      int y = ys[i];
      int z = x | y;
      zs[i] = z;
    }
    return zs;
  }

  public String padding(String s, int n) {
    int len = s.length();

    if (len == n)
      return s;

    int diff = n - len;
    String blank = new String(new char[diff])
      .replace("\0", " ");
    return blank + s;
  }
}

class Row {
  private ArrayList<Cell> row;

  public Row(int[] numbers) {
    row = new ArrayList<>();
    for (int number : numbers) {
      Cell cell = new Cell(number);
      cell.base2();
      cell.sharp();
      row.add(cell);
    }
  }

  public ArrayList<Cell> getRow() {
    return row;
  }
}

class Cell {
  private int n;
  private ArrayList<Integer> bits;
  private ArrayList<Character> sharps;

  public Cell(int n) {
    this.n = n;
    bits = new ArrayList<>();
  }

  public void base2() {
    if (n < 2) {
      bits.add(0, n);

    } else {
      int q = (int) Math.floor(n / 2);
      int r = n % 2;
      bits.add(0, r);
      n = q;
      base2();
    }
  }

  public void sharp() {
    sharps = new ArrayList<>();
    for (Integer bit : bits)
      sharps.add((bit == 1) ? '#' : ' ');
  }

  public ArrayList<Integer> getBits() {
    return bits;
  }

  public ArrayList<Character> getSharps() {
    return sharps;
  }

  public String toString() {
    String s = "";
    for (char c : sharps)
      s += c;
    return s;
  }
}

public class SecretMap {
  public static void main(String[] args) {
    Solution s = new Solution();
    int n = 5;
    int[] xs = {9, 20, 28, 18, 11};
    int[] ys = {30, 1, 21, 17, 28};
    String[] answer = s.solution(n, xs, ys);

    for (String ans : answer)
      System.out.println(ans);
  }
}
