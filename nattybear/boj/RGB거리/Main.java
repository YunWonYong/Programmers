import java.util.*;

public class Main {
  public static void main(String[] args) {

    int RED   = 0;
    int GREEN = 1;
    int BLUE  = 2;

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] sum = new int[n+1][3];
    sum[0] = new int[] {0, 0, 0};

    for (int i = 1; i <= n; i++) {
      int r = sc.nextInt();
      int g = sc.nextInt();
      int b = sc.nextInt();
      sum[i] = new int[] { r + Math.min(sum[i-1][GREEN], sum[i-1][BLUE])
                         , g + Math.min(sum[i-1][RED],   sum[i-1][BLUE])
                         , b + Math.min(sum[i-1][RED],   sum[i-1][GREEN]) };
    }

    System.out.println(minimum(sum[n]));
  }

  static int minimum(int[] xs) {
    int min = xs[0];
    for (int i = 1; i < xs.length; i++)
      if (xs[i] < min)
        min = xs[i];
    return min;
  }
}
