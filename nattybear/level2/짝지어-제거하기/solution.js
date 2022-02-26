function solution(s) {
  const xs = s.split('')
  const ys = remove_pairs(xs)
  if (ys.length == 0)
    return 1
  else
    return 0
}

function remove_pairs(xs) {
  const ys = remove_pair(xs)
  if (ys.length == 0)
    return ys
  if (ys.length == xs.length)
    return ys
  return remove_pairs(ys)
}

function remove_pair(xs) {
  if (xs.length < 1)
    return xs
  const ys = [...xs]
  for (let i = 0; i < ys.length-1; i++) {
    let a = ys[i]
    let b = ys[i+1]
    if (a == b) {
      ys.splice(i, 2)
      return ys
    }
  }
  return ys
}
