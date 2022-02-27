class Point {
  constructor(x, y) {
    this.x = x
    this.y = y
  }

  up() {
    return new Point(this.x - 1, this.y)
  }

  down() {
    return new Point(this.x + 1, this.y)
  }

  left() {
    return new Point(this.x, this.y - 1)
  }

  right() {
    return new Point(this.x, this.y + 1)
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

function next(point, query) {
  let [x1, y1, x2, y2] = query
  if (point.x == x1) {
    if (point.y == y2) {
      return point.down()
    }
    return point.right()
  }
  if (point.y == y2) {
    if (point.x == x2) {
      return point.left()
    }
    return point.down()
  }
  if (point.x == x2) {
    if (point.y == y1) {
      return point.up()
    }
    return point.left()
  }
  if (point.y == y1) {
    if (point.x == x1) {
      return right()
    }
    return up()
  }
}
