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
    if (this.empty()) {
      this.values.push(value)
      return
    }
    switch (value) {
      case '(':
        this.values.push(value)
        break
      case ')':
        if (this.peek() == '(')
          this.pop()
        else
          this.values.push(value)
        break
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

function valid(p) {
  const stack = new Stack()
  for (let c of p)
    stack.push(c)
  return stack.empty()
}
