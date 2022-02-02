function solution(n, left, right) {
  const arr = []
  const remainder = left % n
  const limit = (right - left + 1) + remainder
  let cnt = 0
  for (let i = row(n, left); i <= n; i++) {
    let j = 1
    for (; j <= i; j++) {
      arr.push(i)
      cnt++
      if (cnt == limit)
        return arr.slice(remainder)
    }
    for (; j <= n; j++) {
      arr.push(j)
      cnt++
      if (cnt == limit)
        return arr.slice(remainder)
    }
  }
}

function row(n, left) {
  return Math.floor(left / n) + 1
}
