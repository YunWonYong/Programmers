function solution(n) {
  return base10(base3(n));
}

function base3(n) {
  function go(n, xs) {
    if (n < 3) {
      xs.push(n);
      return xs;
    } else {
      const q = Math.floor(n / 3);
      const r = n % 3;
      xs.push(r);
      return go(q, xs);
    }
  }
  return go(n, []);
}

function base10(xs) {
  let sum = 0;
  const size = xs.length;
  for (let i = 0; i < size; i++)
    sum += xs[i] * 3**(size-i-1);
  return sum;
}

console.log(solution(45));
console.log(solution(125));
