class Zipper {
  constructor(s) {
    this.focus = []
    this.crumb = s.split("")
  }

  goForward() {
    if (this.focus.length == 0)
      return this
    this.crumb.push(this.focus.pop())
  }

  goBack() {
    if (this.crumb.length == 0)
      return
    this.focus.push(this.crumb.pop())
  }

  remove() {
    if (this.crumb.length == 0)
      return
    this.crumb.pop()
  }

  put(c) {
    this.crumb.push(c)
  }

  toArray() {
    return this.crumb.concat(this.focus.reverse()).join("")
  }
}

function interpret(line, zipper) {
  const pair = line.split(" ")
  const command = pair[0]
  switch (command) {
    case "L":
      zipper.goBack()
      break
    case "D":
      zipper.goForward()
      break
    case "B":
      zipper.remove()
      break
    case "P":
      const c = pair[1]
      zipper.put(c)
  }
  return zipper
}

function main() {
  const fs = require("fs")
  const lines = fs.readFileSync("/dev/stdin").toString().split("\n")
  const s = lines[0]
  const n = parseInt(lines[1])
  const commands = lines.slice(2, -1)
  const zipper = new Zipper(s)
  let newZipper = undefined
  for (let i = 0; i < n; i++)
    newZipper = interpret(commands[i], zipper)
  console.log(newZipper.toArray())
}

main()
