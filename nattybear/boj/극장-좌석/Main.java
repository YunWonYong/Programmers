import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] fix = new int[m];
    for (int i = 0; i < m; i++)
      fix[i] = sc.nextInt();
    int left = (fix[0] != 1) ? fib(fix[0] - 1) : 0;
    int right = (fix[m-1] != n) ? fib(n - fix[m-1]) : 0;
    int middle = product(mapFib(between(fix)));
    System.out.println(left * middle * right);
  }

  static int fib(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;
    int[] dp = new int[n];
    dp[0] = 1;
    dp[1] = 2;
    for (int i = 2; i < n; i++)
      dp[i] = dp[i-1] + dp[i-2];
    return dp[n-1];
  }

  static int[] between(int[] fix) {
    int[] result = new int[fix.length-1];
    for (int i = 1; i < fix.length; i++)
      result[i-1] = fix[i] - fix[i-1] - 1;
    return result;
  }

  static int[] mapFib(int[] xs) {
    int[] ys = new int[xs.length];
    for (int i = 0; i < xs.length; i++)
      ys[i] = fib(xs[i]);
    return ys;
  }

  static int product(int[] xs) {
    int acc = 1;
    for (int i = 0; i < xs.length; i++)
      acc *= xs[i];
    return acc;
  }
}
