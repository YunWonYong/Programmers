function solution(s) {
  if (s.length == 1)
    return 1
  const xs = []
  for (let i = 1; i < s.length; i++)
    xs.push(compress(s, i).length)
  return Math.min(...xs)
}

function compress(s, n) {
  return split(s, n)
    .map(count)
    .join('')
}

function split(s, n) {
  let can = []
  const bag = []
  function go(s) {
    if (s.length == 0)
      return
    const fst = take(n, s)
    const tail = drop(n, s)
    const snd = take(n, tail)
    if (fst == snd) {
      can.push(fst)
      go(tail)
    }
    else {
      can.push(fst)
      bag.push(can)
      can = []
      go(tail)
    }
  }
  go(s)
  return bag
}

function count(xs) {
  const x = take(1, xs)
  const n = xs.length
  if (n == 1)
    return x
  else
    return n.toString() + x
}

function take(n, s) {
  if (s.length <= n)
    return s
  return s.slice(0, n)
}

function drop(n, s) {
  if (s.length <= n)
    return ""
  return s.slice(n)
}
