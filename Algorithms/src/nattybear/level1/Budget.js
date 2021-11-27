function solution(d, budget) {

  let sum = 0;
  let acc = 0;

  d.sort((x, y) => x - y);

  for (let e of d) {
    sum += e;
    if (sum <= budget)
      acc++;
    else
      break;
  }

  return acc;
}

console.log(solution([1, 3, 2, 5, 4], 9));
console.log(solution([2, 2, 3, 3], 10));
