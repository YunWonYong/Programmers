import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[n];
    int[] dp = new int[n];

    for (int i = 0; i < n; i++)
      seq[i] = sc.nextInt();

    dp[0] = seq[0];
    int answer = dp[0];

    for (int i = 1; i < n; i++) {
      dp[i] = Math.max(dp[i-1] + seq[i], seq[i]);
      answer = Math.max(answer, dp[i]);
    }

    System.out.println(answer);
  }
}
