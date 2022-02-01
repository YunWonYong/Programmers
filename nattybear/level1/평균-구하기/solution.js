function solution(arr) {
  const sum = arr.reduce((acc, x) => acc + x)
  return sum / arr.length
}
