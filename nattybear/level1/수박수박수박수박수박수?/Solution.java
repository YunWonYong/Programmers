import java.util.stream.IntStream;

class Solution {
  public String solution(int n) {
    Cycle cycle = new Cycle("수박");
    int[] array = IntStream
      .generate(cycle::supply)
      .limit(n)
      .toArray();
    return new String(array, 0, n);
  }
}

class Cycle {
  private String s;
  private int count;

  Cycle(String s) {
    this.s = s;
  }

  int supply() {
    int index = count++ % s.length();
    return s.charAt(index);
  }
}
