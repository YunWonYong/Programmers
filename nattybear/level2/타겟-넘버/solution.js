class Tree {
  constructor(n, l, r) {
    this.node = n
    this.left = l
    this.right = r
  }
}

function solution(numbers, target) {
  const depth = numbers.length
  make_tree([], depth)
  return signs
    .map(xs => zip_with((x,y) => x * y, xs, numbers))
    .map(xs => xs.reduce((acc,x) => acc + x))
    .filter(x => x == target)
    .length
}

const signs = []

function make_tree(value, depth) {
  if (depth == 0) {
    signs.push(value)
    return
  }
  const left = make_tree(value.concat(1), depth - 1)
  const right = make_tree(value.concat(-1), depth - 1)
  return new Tree(value, left, right)
}

function zip_with(f, xs, ys) {
  const zs = []
  for (let i = 0; i < xs.length; i++) {
    let x = xs[i]
    let y = ys[i]
    let z = f(x, y)
    zs.push(z)
  }
  return zs
}
