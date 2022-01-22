function solution(n, left, right) {
  const gen = go(n)
  return Array.from(take(right - left + 1, drop(left, gen)))
}

function* go(n) {
  for (let i = 1; i <= n; i++) {
    yield* take(i, repeat(i))
    yield* drop(i, range(n))
  }
}

function* range(end) {
  for (let i = 1; i <= end; i++)
    yield i
}

function* repeat(n) {
  while (true)
    yield n
}

function* take(n, xs) {
  for (let i = 0; i < n; i++)
    yield xs.next().value
}

function* drop(n, xs) {
  for (let i = 0; i < n; i++)
    xs.next()
  yield* xs
}
