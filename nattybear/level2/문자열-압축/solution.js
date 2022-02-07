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

function compress(s, n) {
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

console.log(compress("hello", 1))
