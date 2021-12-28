class Solution {
  public int solution(int n) {
    int count = 0;
    for (int i = 2; i <= n; i++)
      if (prime(i))
        count++;
    return count;
  }

  boolean prime(int n) {
    if (n < 2)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2)
      if (n % i == 0)
        return false;
    return true;
  }
}
