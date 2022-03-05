class Stack {
  constructor() {
    this.values = []
  }

  empty() {
    return this.values.length == 0
  }

  peek() {
    const size = this.values.length
    return this.values[size - 1]
  }

  pop() {
    this.values.pop()
  }

  push(value) {
    if (this.empty())
      values.push(value)
    else {
      if (this.peek() == value)
        this.pop()
      else
        this.values.push(value)
    }
  }

}

function count(xs, c) {
  let count = 0
  for (let x of xs)
    if (x == c)
      count++
  return count
}

function balance(p) {
  const open = count(p, '(')
  const close = count(p, ')')
  return open == close
}
