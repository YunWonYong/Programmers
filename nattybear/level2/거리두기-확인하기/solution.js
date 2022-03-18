class Seat {
  constructor(r, c) {
    this.row = r
    this.column = c
  }

  distance(s) {
    const rd = Math.abs(this.row - s.row)
    const cd = Math.abs(this.column - s.column)
    return rd + cd
  }

  all_safe(r) {
    const list = this.surround()
    return list
      .filter(x => x.isPerson(r))
      .every(x => this.safe(x, r))
  }

  safe(s, r) {
    if (this.distance(s) == 1)
      return false
    return this
      .path(s)
      .every(x => x.isPartition(r))
  }

  isPartition(r) {
    return r.what(this) == 'X'
  }

  isPerson(r) {
    return r.what(this) == 'P'
  }

  inRange() {
    return 0 <= this.row &&
           this.row <= 4 &&
           0 <= this.column &&
           this.column <= 4
  }

  path(s) {
    const list = []
    if (this.row == s.row)
      list.push(new Seat(this.row, Math.min(this.column, s.column)+1))
    else if (this.column == s.column)
      list.push(new Seat(Math.min(this.row, s.row)+1, this.column))
    else {
      if (s.row < this.row && s.column < this.column) {
        list.push(this.up(1))
        list.push(this.left(1))
      } else if (s.row < this.row && this.column < s.column) {
        list.push(this.up(1))
        list.push(this.right(1))
      } else if (this.row < s.row && s.column < this.column) {
        list.push(this.down(1))
        list.push(this.left(1))
      } else {
        list.push(this.down(1))
        list.push(this.right(1))
      }
    }
    return list
  }

  surround() {
    const list = []
    for (let i = 1; i <= 2; i++) {
      list.push(this.up(i))
      list.push(this.down(i))
      list.push(this.left(i))
      list.push(this.right(i))
    }
    list.push(this.up(1).left(1))
    list.push(this.up(1).right(1))
    list.push(this.down(1).left(1))
    list.push(this.down(1).right(1))
    return list
      .filter(x => x.inRange())
  }

  up(n) { return new Seat(this.row-n, this.column) }

  down(n) { return new Seat(this.row+n, this.column) }

  left(n) { return new Seat(this.row, this.column-n) }

  right(n) { return new Seat(this.row, this.column+n) }
}

class Room {
  constructor(place) {
    this.seats = []
    for (let i = 0; i < 5; i++)
      this.seats.push(Array(5))
    for (let i = 0; i < 5; i++)
      for (let j = 0; j < 5; j++)
        this.seats[i][j] = place[i][j]
  }

  safe() {
    const list = this.getPersons()
    return list.every(x => x.all_safe(this))
  }

  what(s) {
    return this.seats[s.row][s.column]
  }

  getPersons() {
    const list = []
    for (let i = 0; i < 5; i++)
      for (let j = 0; j < 5; j++)
        if (this.seats[i][j] == 'P')
          list.push(new Seat(i, j))
    return list
  }
}

function solution(places) {
  const list = []
  for (let place of places) {
    room = new Room(place)
    list.push(room.safe())
  }
  return list.map(x => x ? 1 : 0)
}
