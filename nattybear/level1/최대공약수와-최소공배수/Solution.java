class Solution {
  public int[] solution(int n, int m) {
    int g = gcd(n, m);
    int l = lcm(n, m);
    return new int[] {g, l};
  }

  static int gcd(int n, int m) {
    if (m == 0)
      return n;
    else
      return gcd(m, n % m);
  }

  static int lcm(int n, int m) {
    return n * m / gcd(n, m);
  }
}
