package nattybear.level1;

class Solution {
  public long solution(int price, int money, int count) {
    long result = totalPrice(price, count) - money;
    return (result < 0) ? 0 : result;
  }

  long totalPrice(int price, int count) {
    long sum = 0;
    for (int i = 1; i <= count; i++)
      sum += price*i;
    return sum;
  }
}

public class Amusement {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.solution(3, 20, 4));
  }
}
