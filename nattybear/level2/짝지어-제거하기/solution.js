function solution(s) {
  const xs = s.split('')
  remove_pair(xs)
  if (xs[0])
    return 0
  else
    return 1
}

function remove_pair(xs) {
  let i = 0
  while (true) {
    let x = xs[i]
    let y = xs[i+1]
    if (!x || !y)
      break
    if (x == y) {
      xs.splice(i, 2)
      i = 0
      continue
    }
    i++
  }
  return xs
}
