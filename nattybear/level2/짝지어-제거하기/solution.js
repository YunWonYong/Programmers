function solution(s) {
  const xs = s.split('')
  remove_pair(xs)
  if (xs.length == 0)
    return 1
  else
    return 0
}

function remove_pair(xs) {
  while (true) {
    const before = xs.length
    for (let i = 0; i < xs.length-1; i++) {
      let x = xs[i]
      let y = xs[i+1]
      if (x == y) {
        xs.splice(i, 2)
        break
      }
    }
    const after = xs.length
    if (before == after)
      break
  }
  return xs
}
