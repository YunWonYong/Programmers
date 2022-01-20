function solution(n) {
  const xs = digits(n).sort((x, y) => y - x)
  return number(xs)
}

function digits(n) {
  const xs = []
  while (n > 0) {
    xs.push(n % 10)
    n = Math.floor(n / 10)
  }
  return xs
}

function number(xs) {
  const size = xs.length
  let sum = 0
  for (let i = 0; i < size; i++)
    sum += xs[i] * (10 ** (size - i - 1))
  return sum
}
