class Calculator {
  constructor(expression) {
    this.expression = expression
    this.current = 0
    this.get_char()
  }

  get_char() {
    if (this.current < this.expression.length)
      this.look = this.expression.charAt(this.current++)
  }

  get_num() {
    let tmp = ''
    while (/[0-9]/.test(this.look)) {
      tmp += this.look
      this.get_char()
    }
    return parseInt(tmp)
  }

  get_set() {
    const set = new Set()
    this.get_char()
    set.add(this.get_num())
    while (this.look != '}') {
      this.get_char()
      set.add(this.get_num())
    }
    this.get_char()
    return set
  }

  get_sets() {
    const sets = []
    this.get_char()
    sets.push(this.get_set())
    while (this.look != '}') {
      this.get_char()
      sets.push(this.get_set())
    }
    return sets
  }
}

function solution(s) {
  const calculator = new Calculator(s)
  const answer = []
  const sets = calculator.get_sets()
  sets.sort((x, y) => x.size - y.size)
  sets.reduce((x, y) => {
    const tmp = new Set(y)
    const set = new Set([...y].filter(z => !x.has(z)))
    set.forEach((k, _) => answer.push(k))
    return tmp
  }, new Set())
  return answer
}
