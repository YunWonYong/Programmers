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

  next(query) {
    const [x1, y1, x2, y2] = query
    if (this.x == x1) {
      if (this.y == y2) {
        return this.down()
      }
      return this.right()
    }
    if (this.y == y2) {
      if (this.x == x2) {
        return this.left()
      }
      return this.down()
    }
    if (this.x == x2) {
      if (this.y == y1) {
        return this.up()
      }
      return this.left()
    }
    if (this.y == y1) {
      if (this.x == x1) {
        return this.right()
      }
      return this.up()
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

  move(point, query) {
    const value = this.get(point)
    this.set(point, undefined)
    const q = point.next(query)
    if (this.get(q)) {
      this.move(q, query)
    }
    this.set(q, value)
  }

  rotate(query) {
    const [x1, y1, x2, y2] = query
    const start = new Point(x1, y1)
    this.move(start, query)
  }
}

function solution(rows, columns, queries) {
}

const m = new Matrix(6, 6)
m.rotate([2,2,5,4])
console.log(m.matrix)
