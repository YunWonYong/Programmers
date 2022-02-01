function solution(num) {
  const answer  = collatz(num)
  return (answer < 500) ? answer : -1
}

function collatz(x) {
  if (x == 1)
    return 0

  if (x % 2 == 0)
    return 1 + collatz(Math.floor(x / 2))
  else
    return 1 + collatz(x*3 + 1)
}
