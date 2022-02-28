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

  next(point, query) {
    const [x1, y1, x2, y2] = query
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
        return point.right()
      }
      return point.up()
    }
  }
}

class Matrix {
  constructor(row, column) {
    let x = 1
    let line = []
    this.matrix = []
    for (let i = 0; i < row; i++) {
      for (let j = 0; j < column; j++) {
        line.push(x)
        x++
      }
      this.matrix.push(line)
      line = []
    }
  }

  get(point) {
    return this.matrix[point.x-1][point.y-1]
  }

  set(point, value) {
    this.matrix[point.x-1][point.y-1] = value
  }
}

function solution(rows, columns, queries) {
}

const m = new Matrix(2,2)
m.set(new Point(1,1), 7)
console.log(m.matrix)
