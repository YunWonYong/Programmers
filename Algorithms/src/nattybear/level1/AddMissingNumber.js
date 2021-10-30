function solution(numbers) {
  const sum = numbers
    .reduce((a, b) => a + b, 0)

  return 45 - sum;
}
