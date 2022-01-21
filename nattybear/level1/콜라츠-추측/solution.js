function solution(num) {
  const len = collatz(num).length - 1
  return (len < 500) ? len : -1
}

function collatz(x) {
  // base case
  if (x == 1)
    return [1]

  const y = (x % 2 == 0) ? x / 2 : x*3 + 1

  return [x].concat(collatz(y))
}
