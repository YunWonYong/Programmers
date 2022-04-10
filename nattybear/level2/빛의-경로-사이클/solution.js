class Grid {
  constructor(grid) {
    this.numRow = grid.length
    this.numCol = grid[0].length
    this.lenCycle = 0
    this.cycles = []

    this.grid = new Array(this.numRow)

    for (let i = 0; i < this.numRow; i++)
      this.grid[i] = new Array(this.numCol)

    for (let i = 0; i < this.numRow; i++)
      for (let j = 0; j < this.numCol; j++) {
        const c = grid[i].charAt(j)
        this.grid[i][j] = new Cell(this, c, i, j)
      }
  }

  getCell(row, col) {
    return this.grid[row][col]
  }

  cycle() {
    for (let i = 0; i < this.numRow; i++)
      for (let j = 0; j < this.numCol; j++)
        this.grid[i][j].cycle()
    return this.cycles
  }
}

class Cell {
  constructor(grid, type, row, col) {
    this.grid = grid
    this.type = type
    this.row = row
    this.col = col
    this.east = new Port(this, 'E')
    this.west = new Port(this, 'W')
    this.south = new Port(this, 'S')
    this.north = new Port(this, 'N')
  }

  up() {
    let newRow = this.row - 1
    this.grid.lenCycle++
    if (newRow < 0)
      newRow = this.grid.numRow - 1
    return this.grid.getCell(newRow, this.col)
  }

  down() {
    let newRow = this.row + 1
    this.grid.lenCycle++
    if (newRow >= this.grid.numRow)
      newRow = 0
    return this.grid.getCell(newRow, this.col)
  }

  left() {
    let newCol = this.col - 1
    this.grid.lenCycle++
    if (newCol < 0)
      newCol = this.grid.numCol - 1
    return this.grid.getCell(this.row, newCol)
  }

  right() {
    let newCol = this.col + 1
    this.grid.lenCycle++
    if (newCol >= this.grid.numCol)
      newCol = 0
    return this.grid.getCell(this.row, newCol)
  }

  cycle() {
    this.east.cycle()
    this.west.cycle()
    this.south.cycle()
    this.north.cycle()
  }
}

class Port {
  constructor(cell, position) {
    this.cell = cell
    this.position = position
    this.src = false
    this.dst = false
  }

  shoot() {
    let cell = undefined
    let port = undefined
    switch (this.position) {
      case 'E':
        cell = this.cell.right()
        port = cell.west
        break
      case 'W':
        cell = this.cell.left()
        port = cell.east
        break
      case 'S':
        cell = this.cell.down()
        port = cell.north
        break
      case 'N':
        cell = this.cell.up()
        port = cell.south
    }
    this.src = true
    port.dst = true
    return port
  }

  curve() {
    let port = undefined
    if (this.cell.type == 'L') {
      switch (this.position) {
        case 'E':
          port = this.cell.south
          break
        case 'W':
          port = this.cell.north
          break
        case 'S':
          port = this.cell.west
          break
        case 'N':
          port = this.cell.east
      }
    }
    else if (this.cell.type == 'R') {
      switch (this.position) {
        case 'E':
          port = this.cell.north
          break
        case 'W':
          port = this.cell.south
          break
        case 'S':
          port = this.cell.east
          break
        case 'N':
          port = this.cell.west
      }
    }
    else {
      switch (this.position) {
        case 'E':
          port = this.cell.west
          break
        case 'W':
          port = this.cell.east
          break
        case 'S':
          port = this.cell.north
          break
        case 'N':
          port = this.cell.south
      }
    }
    return port
  }

  cycle() {
    if (this.src) {
      this.cell.grid.cycles.push(this.cell.grid.lenCycle)
      this.cell.grid.lenCycle = 0
      return
    }
    this.shoot().curve().cycle()
  }

  cycle() {
    if (!this.src) {
      let port = this
      while (true) {
        port = port.shoot().curve()
        if (port.src)
          break
      }
    }
    this.cell.grid.cycles.push(this.cell.grid.lenCycle)
    this.cell.grid.lenCycle = 0
  }
}

function solution(grid) {
  const g = new Grid(grid)
  return g
    .cycle()
    .filter(x => x != 0)
    .sort((x, y) => x - y)
}
