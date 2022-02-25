function solution(w, h) {
  const total = w * h
  const invalid = bresenham(w, h)
  return total - invalid
}

function bresenham(w, h) {
  const line = h / w
  let x = 1
  let y = 1
  let n = 0
  while (true) {
    if (x == w && y == h)
      break
    let slope = y / x
    if (slope < line) {
      y++ 
      n++
      continue
    }
    if (slope > line) {
      x++
      n++
      continue
    }
    if (slope == line) {
      x++
      y++
      n++
      continue
    }
  }
  return n + 1
}
