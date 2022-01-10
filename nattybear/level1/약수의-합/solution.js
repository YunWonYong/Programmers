function solution(n) {
  const sum = divisor(n).reduce((acc, x) => acc + x)
  return sum
}

function divisor(n) {
  const ds = [1, n]
  for (let i = 2; i < n; i++)
    if (n % i == 0)
      ds.push(i)
  return ds
}
