function solution(n, left, right) {
  const rows = []
  for (let i = 1; i <= n; i++) {
    let j = 1
    for (; j <= i; j++) {
      rows.push(i)
    }
    for (; j <= n; j++) {
      rows.push(j)
    }
  }
  return rows.slice(left, right+1)
}

console.log(solution(3, 2, 5))
console.log(solution(4, 7, 14))
