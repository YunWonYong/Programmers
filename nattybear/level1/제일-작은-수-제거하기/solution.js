function solution(arr) {
  const min = Math.min(...arr)
  const answer = arr.filter(x => x != min)
  if (answer.length == 0)
    return [-1]
  else
    return answer
}
