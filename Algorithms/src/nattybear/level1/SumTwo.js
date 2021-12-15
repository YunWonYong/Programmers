function solution(a, b) {
  const n = Math.abs(a - b);
  return n * (a + b) / 2;
}

console.log(solution(3, 5));
console.log(solution(5, 3));
