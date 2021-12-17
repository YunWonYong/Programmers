function solution(a, b) {
  const ab = zipWith((x, y) => x * y, a, b)
  return ab.reduce((x, y) => x + y, 0);
}

const zipWith = (f, a, b) => a.map((k, i) => f(k, b[i]));
