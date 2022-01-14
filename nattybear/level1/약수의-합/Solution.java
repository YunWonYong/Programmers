import java.util.ArrayList;
import java.util.Optional;

class Solution {
  public int solution(int n) {
    Optional<ArrayList<Integer>> divisors = generateDivisors(n);

    if (divisors.isPresent())
      return divisors.get().stream().reduce(0, (acc, x) -> acc + x);
    else
      return 0;
  }

  public Optional<ArrayList<Integer>> generateDivisors(int n) {
    if (n == 0)
      return Optional.empty();

    ArrayList<Integer> divisors = new ArrayList<>();
    divisors.add(1);

    if (n == 1)
      return Optional.of(divisors);

    for (int i = 2; i < n; i++)
      if (n % i == 0)
        divisors.add(i);

    divisors.add(n);
    return Optional.of(divisors);
  }
}
