function solution(absolutes, signs) {
  const ones = signs.map(x => x ? 1 : -1)
  const numbers = zipWith((a, b) => a * b, absolutes, ones);
  return numbers.reduce((a, b) => a + b, 0);
}

const zipWith = (f, a, b) => a.map((k, i) => f(k, b[i]));
