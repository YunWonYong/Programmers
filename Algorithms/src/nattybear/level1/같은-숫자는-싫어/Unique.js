function solution(xs) {
  const ys = [];
  for (let x of xs)
    if (x != last(ys))
      ys.push(x);
  return ys;
}

function last(xs) {
  if (xs.length == 0)
    return null;
  else
    return xs[xs.length - 1];
}

console.log(solution([1,1,3,3,0,1,1]));
console.log(solution([4,4,4,3,3]));
