int solution(int n) {
  if (n == 0 || n == 1)
    return n;

  int sum = 0;

  for (int i = 2; i <= n; i++)
    if (n % i == 0)
      sum += i;

  return sum;
}
