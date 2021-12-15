function solution(xs, d) {
  const ys = go(xs, d);
  if (ys.length == 0)
    return [-1];
  else
    return ys;
}

function go(xs, d) {
  return xs 
    .filter(x => x % d == 0)
    .sort((x, y) => x - y);
}

console.log(solution([5, 9, 7, 10], 5));
console.log(solution([2, 36, 1, 3], 1));
console.log(solution([3, 2, 6], 10));
