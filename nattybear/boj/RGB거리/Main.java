import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Paint[] dp = new Paint[n];
    Paint[][] paints = new Paint[n][3];
    for (int i = 0; i < n; i++)
      paints[i] = new Paint[] { new Paint("Red",   sc.nextInt())
                              , new Paint("Green", sc.nextInt())
                              , new Paint("Blue",  sc.nextInt()) };
    dp[0] = minimum(paints[0]);
    for (int i = 1; i < n; i++)
      dp[i] = minimum(filter(dp[i-1], paints[i]));

    System.out.println(sum(dp));
  }

  static Paint minimum(Paint[] paints) {
    Paint min = paints[0];
    for (int i = 1; i < paints.length; i++)
      if (paints[i].getCost() < min.getCost())
        min = paints[i];
    return min;
  }

  static Paint[] filter(Paint paint, Paint[] paints) {
    Paint[] newPaints = new Paint[2];
    int j = 0;
    for (int i = 0; i < paints.length; i++)
      if (paint.getColor() != paints[i].getColor())
        newPaints[j++] = paints[i];
    return newPaints;
  }

  static int sum(Paint[] paints) {
    int s = 0;
    for (int i = 0; i < paints.length; i++)
      s += paints[i].getCost();
    return s;
  }
}

class Paint {
  private String color;
  private int cost;

  public Paint(String color, int cost) {
    this.color = color;
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }

  public String getColor() {
    return color;
  }

  public String toString() {
    return color + " " + cost;
  }
}
