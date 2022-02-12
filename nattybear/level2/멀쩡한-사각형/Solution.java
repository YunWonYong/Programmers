class Solution {
  public long solution(int w, int h) {
    long total = (long) (w * h);
    long invalid = bresenham(w, h);
    System.out.println(total + " " + invalid);
    return total - invalid;
  }

  static long bresenham(long w, long h) {
    double line = (double)h / w;
    int x = 1;
    int y = 1;
    long n = 0;
    while (true) {
      if (x == w && y == h)
        break;
      double slope = (double)y / x;
      if (slope < line) {
        y++;
        n++;
        continue;
      }
      if (slope > line) {
        x++;
        n++;
        continue;
      }
      if (slope == line) {
        x++;
        y++;
        n++;
        continue;
      }
    }
    return n + 1;
  }
}
