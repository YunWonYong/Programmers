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
