function solution(x, n) {
  return take(n, iterate(y => y + x, x))
}

function* iterate(f, x) {
  while (true) {
    yield x
    x = f(x)
  }
}

function take(n, xs) {
  const ys = []
  for (let i = 0; i < n; i++)
    ys.push(xs.next().value)
  return ys
}
