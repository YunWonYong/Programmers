function solution(n, xs, ys) {
  const zs = zip(xs, ys);
  return zs
    .map(x => base2(x))
    .map(x => x.map(convert))
    .map(x => x.reduce((x, y) => x + y))
    .map(x => x.padStart(n, ' '));
}

function zip(xs, ys) {
  const zs = [];
  for (let i = 0; i < xs.length; i++) {
    let x = xs[i];
    let y = ys[i];
    let z = x | y;
    zs.push(z);
  }
  return zs;
}

function base2(n) {
  function go(n, xs) {
    if (n < 2) {
      xs.unshift(n);
      return xs;
    }
    const q = Math.floor(n / 2);
    const r = n % 2;
    xs.unshift(r);
    return go(q, xs);
  }
  return go(n, []);
}

function convert(n) {
  if (n == 1)
    return "#";
  else
    return " ";
}

console.log(solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]));
console.log(solution(6, [46, 33, 33 ,22, 31, 50], [27 ,56, 19, 14, 14, 10]));
