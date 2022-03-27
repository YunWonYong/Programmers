class Op {
  constructor(value, table) {
    switch (value) {
      case '*':
        this.precedence = table[0]
        break
      case '+':
        this.precedence = table[1]
        break
      case '-':
        this.precedence = table[2]
        break
    }
    this.value = value
  }
}

class Lexer {
  constructor(expression, table) {
    this.expression = expression
    this.current = 0
    this.table = table
    this.get_char()
  }

  get_char() {
    if (this.current < this.expression.length)
      this.look = this.expression.charAt(this.current++)
    else
      this.look = ' '
  }

  get_num() {
    let number = ''
    while (/[0-9]/.test(this.look)) {
      number += this.look
      this.get_char()
    }
    return parseInt(number)
  }

  get_op() {
    const op = new Op(this.look, this.table)
    this.get_char()
    return op
  }

  get_tokens() {
    const tokens = []
    tokens.push(this.get_num())
    while (this.look != ' ') {
      tokens.push(this.get_op())
      tokens.push(this.get_num())
    }
    return tokens
  }
}

class Tree {
  constructor(tokens) {
    if (tokens.length == 1)
      this.node = tokens[0]
    else {
      const min = this.min_index(tokens)
      this.node = tokens[min]
      this.left = new Tree(tokens.slice(0, min))
      this.right = new Tree(tokens.slice(min+1))
    }
  }

  min_index(tokens) {
    let min = 0
    for (let i = 0; i < tokens.length; i++)
      if (tokens[i] instanceof Op) {
        min = i
        break
      }
    for (let i = 0; i < tokens.length; i++) {
      if (!tokens[i] instanceof Op)
        continue
      let op1 = tokens[min]
      let op2 = tokens[i]
      if (op1.precedence >= op2.precedence)
        min = i
    }
    return min
  }
}

class Interpreter {
  static visit(tree) {
    let result = 0
    if (!(tree.node instanceof Op))
      return tree.node
    const left = this.visit(tree.left)
    const right = this.visit(tree.right)
    switch (tree.node.value) {
      case '+':
        result = left + right
        break
      case '-':
        result = left - right
        break
      case '*':
        result = left * right
        break
    }
    return result
  }
}

function solution(expression) {
  const tables = [
    [1, 2, 3],
    [1, 3, 2],
    [2, 1, 3],
    [2, 3, 1],
    [3, 1, 2],
    [3, 2, 1]
  ]
  const answers = []
  for (let table of tables)
    answers.push(helper(expression, table))
  return Math.max(...answers)
}

function helper(expression, table) {
  const lexer = new Lexer(expression, table)
  const tokens = lexer.get_tokens()
  const tree = new Tree(tokens)
  return Math.abs(Interpreter.visit(tree))
}
