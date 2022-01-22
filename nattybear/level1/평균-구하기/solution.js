function solution(arr) {
  const sum = arr.reduce((acc, x) => acc + x)
  return sum / arr.length
}

console.log(solution([1,2,3,4]))
