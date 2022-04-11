class Queue {
  constructor(n) {
    this.answer = 0
    this.queue = []
    for (let i = 1; i <= n; i++)
      this.queue.push(i)
  }

  pop() {
    return this.queue.shift()
  }

  left() {
    const value = this.pop()
    this.queue.push(value)
    this.answer++
  }

  right() {
    const value = this.queue.pop()
    this.queue.unshift(value)
    this.answer++
  }

  rotate(target) {
    const targetIndex = this.queue.indexOf(target)
    const size = this.queue.length
    if (targetIndex <= size / 2)
      for (let i = 0; i < targetIndex; i++)
        this.left()
    else
      for (let i = 0; i < size - targetIndex; i++)
        this.right()
    this.pop()
  }
}

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n', 2)

const [n, m] = lines[0].split(' ').map(x => parseInt(x))
const targets = lines[1].split(' ').map(x => parseInt(x))

const queue = new Queue(n)

for (let i = 0; i < m; i++)
  queue.rotate(targets[i])

console.log(queue.answer)
