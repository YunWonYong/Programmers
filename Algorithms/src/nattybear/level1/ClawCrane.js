function solution(board, moves) {
  const aBoard = new Board(board);
  const basket = new Basket();

  for (let n of moves) {
    Crane.move(aBoard, n, basket);
  }

  return basket.numberOfRemoved;
}

class Stack {
  constructor() {
    this.dolls = [];
  }
}

class Basket extends Stack {
  constructor() {
    super();
    this.numberOfRemoved = 0;
  }

  push(doll) {
    if (this.dolls.length == 0) {
      this.dolls.push(doll);
      return;
    }

    const hat = this.dolls.pop();

    if (hat.shape == doll.shape) {
      this.numberOfRemoved += 2;

    } else {
      this.dolls.push(hat);
      this.dolls.push(doll);
    }
  }
}

class Doll {
  constructor(shape) {
    this.shape = shape;
  }
}

class Board {
  constructor(board) {
    const size = board.length;
    this.stacks = [];

    for (let i = 0; i < size; i++) {
      let stack = [];
      
      for (let j = size - 1; j >= 0; j--) {
        let shape = board[j][i];

        if (shape == 0)
          continue;

        let doll = new Doll(shape);
        stack.push(doll);
      }

      this.stacks.push(stack);
    }
  }

  getStack(n) {
    return this.stacks[n-1];
  }
}

class Crane {
  static move(board, n, basket) {
    const stack = board.getStack(n);
    const doll = stack.pop();

    if (doll == null)
      return;

    basket.push(doll);
  }
}
