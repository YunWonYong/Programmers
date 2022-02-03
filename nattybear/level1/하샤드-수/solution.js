function solution(x) {
  const sum = digits(x).reduce((acc, x) => acc + x)
  return x % sum == 0
}

function digits(x) {
  const _digits = []
  while (x > 0) {
    _digits.push(x % 10)
    x = Math.floor(x / 10)
  }
  return _digits
}
