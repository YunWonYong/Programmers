class Point {
  constructor(x, y) {
    this.x = x
    this.y = y
  }
}

function make_matrix(row, column) {
  let x = 1
  let line = []
  const lines = []
  for (let i = 0; i < row; i++) {
    for (let j = 0; j < column; j++) {
      line.push(x)
      x++
    }
    lines.push(line)
    line = []
  }
  return lines
}
