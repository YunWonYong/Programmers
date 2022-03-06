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

function solution(p) {
  return to_valid(p)
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

function split(u) {
  const v = u.slice(0, 2)
  const w = u.slice(2)
  return _split(v, w)
}

function _split(v, w) {
  if (balance(v) || w.length == 0)
    return [v, w]
  const head = v.concat(w.slice(0, 2))
  const tail = w.slice(2)
  return _split(head, tail)
}

function to_valid(w) {
  if (w.length == 0 || valid(w))
    return w

  const [u, v] = split(w)

  if (valid(u))
    return u.concat(to_valid(v))

  return ["(", to_valid(v), ")", strip_reverse(u)].join("")
}

function strip_reverse(s) {
  return s
    .slice(1, -1)
    .split("")
    .map(flip)
    .join("")
}

function flip(p) {
  if (p == "(")
    return ")"
  else
    return "("
}
