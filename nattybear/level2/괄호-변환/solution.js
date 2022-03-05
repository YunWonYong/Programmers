function count(xs, c) {
  let count = 0
  for (let x of xs)
    if (x == c)
      count++
  return count
}

function balance(p) {
  const open = count(p, '(')
  const close = count(p, ')')
  return open == close
}
