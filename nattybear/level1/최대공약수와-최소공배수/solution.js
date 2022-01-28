function solution(n, m) {
  const g = gcd(n, m)
  const l = lcm(n, m)
  return [g, l]
}

function gcd(n, m) {
  if (m == 0)
    return n
  else
    return gcd(m, n % m)
}

function lcm(n, m) {
  return n * m / gcd(n, m)
}
