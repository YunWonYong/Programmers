function solution(x, n) {
  return take(n, repeat(x))
}

function* repeat(n) {
  const m = n
  while (true) {
    yield n
    n += m
  }
}

function take(n, xs) {
  const ys = []
  for (let i = 0; i < n; i++)
    ys.push(xs.next().value)
  return ys
}
