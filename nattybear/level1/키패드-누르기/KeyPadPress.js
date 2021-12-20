function solution(numbers, hand) {
  const pad = new Pad();
  const hands = new Hands(hand);
  const answer = [];

  for (let number of numbers) {
    let key = pad.keys[number];
    let h = hands.press(key);
    answer.push(h);
  }

  return answer.join("");
}

class Point {
  constructor(x, y) {
    this.x = x;
    this.y = y;
  }

  distance(p) {
    return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
  }
}

class Key {
  constructor(n, p) {
    this.name = n;
    this.point = p;
  }
}

class Pad {
  constructor() {

    this.keys = [];

    let point = new Point(3, 1);
    let key = new Key(0, point);

    this.keys.push(key);

    let name = 1;

    for (let i = 0; i < 3; i++) {
      for (let j = 0; j < 3; j++) {
        point = new Point(i, j);
        key = new Key(name++, point);
        this.keys.push(key);
      }
    }
  }
}

class Hands {
  constructor(t) {
    this.type = t;
    this.left = new Point(3, 0);
    this.right = new Point(3, 2);
  }

  press(key) {
    let result;
    const point = key.point;

    switch (point.y) {
      case 0:
        this.left = point;
        result = 'L';
        break;
      case 2:
        this.right = point;
        result = 'R';
        break;
      case 1:
        result = this.calculate(point);
    }

    return result;
  }

  calculate(point) {
    const leftDistance = this.left.distance(point);
    const rightDistance = this.right.distance(point);

    if (leftDistance < rightDistance) {
      this.left = point;
      return 'L';
    }

    if (leftDistance > rightDistance) {
      this.right = point;
      return 'R';
    }

    if (this.type == "left") {
      this.left = point;
      return 'L';
    }

    this.right = point;
    return 'R';
  }
}
