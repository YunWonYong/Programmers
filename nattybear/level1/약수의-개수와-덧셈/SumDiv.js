function solution(left, right) {
  const xs = range(left, right);
  const ys = xs.map(x => even(numOfDiv(x)) ? x : -x);
  return sum(ys);
}

function sum(xs) {
  return xs.reduce((acc, x) => acc + x);
}

function even(n) {
  return n % 2 == 0;
}

function numOfDiv(n) {
  let num = 1;
  for (let i = 2; i <= n; i++)
    if (n % i == 0)
      num++;
  return num;
}

function range(start, end) {
  const xs = [];
  for (let i = start; i <= end; i++)
    xs.push(i);
  return xs;
}

console.log(solution(13, 17));
