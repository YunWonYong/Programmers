#include <stdio.h>
#include <stdlib.h>

void solution()
{
  int n;
  scanf("%d", &n);
  int m = n + 1;
  long* dp[m];

  for (int i = 1; i < m; i++)
    dp[i] = (long*)malloc(10 * sizeof(long));

  for (int j = 0; j < 10; j++)
    dp[1][j] = 1;

  for (int i = 2; i < m; i++)
    for (int j = 0; j < 10; j++)
      for (int k = 0; k <= j; k++)
        dp[i][j] += dp[i-1][k];

  long answer = 0;

  for (int j = 0; j < 10; j++)
    answer += dp[n][j];

  printf("%lu\n", answer);
}

int main()
{
  int t;
  scanf("%d", &t);
  for (int i = 0; i < t; i++)
    solution();
}
