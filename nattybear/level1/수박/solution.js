function solution(n) {
  const xs = cycle('수박')
  return take(n, xs)
}

function* cycle(s) {
  while (true)
    for (let c of s)
      yield c
}

function take(n, xs) {
  let ys = ''
  for (let i = 0; i < n; i++)
    ys += xs.next().value
  return ys
}
