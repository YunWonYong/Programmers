function solution(n) {
  const m = Math.sqrt(n)
  if (m.toString().includes("."))
    return -1
  else
    return (m + 1) ** 2
}
