import java.util.stream.IntStream;

class Solution {
  private int[] upper;
  private int[] lower;
  private int[] array;

  public Solution() {
    upper = IntStream.range((int) 'A', (int) 'Z' + 1).toArray();
    lower = IntStream.range((int) 'a', (int) 'z' + 1).toArray();
  }

  public String solution(String s, int n) {
    int[] xs = s
      .chars()
      .map(x -> caesar(x, n))
      .toArray();
    return new String(xs, 0, s.length());
  }

  public int caesar(int c, int n) {
    if (c == ' ')
      return c;
    array = ('a' <= c && c <= 'z') ? lower : upper;
    int index = (indexOf(array, c) + n) % 26;
    return array[index];
  }

  public int indexOf(int[] xs, int x) {
    for (int i = 0; i < xs.length; i++)
      if (xs[i] == x)
        return i;
    return -1;
  }
}
