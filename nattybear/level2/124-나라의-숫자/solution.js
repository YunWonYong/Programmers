function solution(n) {
  if (n == 1)
    return 1
  let x = [1]
  for (let i = 0; i < n-1; i++)
    x = succ(x)
  return x.join('')
}

function succ(xs) {
  if (xs.length == 0)
    return [1]
  const i = xs.length - 1
  const last = xs[i]
  if (last == 1) {
    xs[i] = 2
    return xs
  }
  if (last == 2) {
    xs[i] = 4
    return xs
  }
  const ys = succ(init(xs))
  ys.push(1)
  return ys
}

function init(xs) {
  return xs.slice(0, xs.length-1)
}
