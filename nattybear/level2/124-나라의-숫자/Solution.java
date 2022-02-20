class Solution {
  public String solution(int n) {
    StringBuilder sb = new StringBuilder();
    while (true) {
      if (n == 0)
        break;
      if (n < 3) {
        sb.insert(0, n);
        break;
      }
      int rem = n % 3;
      int quo = n / 3;
      if (rem == 0) {
        quo = quo - 1;
        rem = 3;
      }
      sb.insert(0, rem);
      n = quo;
    }
    return sb.toString().replace('3', '4');
  }
}
