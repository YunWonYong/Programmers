function solution(w, h) {
  const total = w * h
  const invalid = bresenham(w, h)
  return total - invalid
}

function bresenham(w, h) {
  const line = h / w
  function go(x, y) {
    if (x == w && y == h)
      return 1
    const slope = y / x
    if (slope < line)
      return 1 + go(x, y+1)
    if (slope > line)
      return 1 + go(x+1, y)
    if (slope == line)
      return 1 + go(x+1, y+1)
  }
  return go(1, 1)
}
