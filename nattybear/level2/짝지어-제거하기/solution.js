function solution(s) {
  for (let i = 0; i < s.length; i++)
    push(s[i])
  if (empty())
    return 1
  else
    return 0
}

const stack = []

function push(x) {
  if (empty())
    stack.push(x)
  else {
    if (x == peek())
      stack.pop()
    else
      stack.push(x)
  }
}

function empty() {
  return stack.length == 0
}

function peek() {
  const size = stack.length
  return stack[size - 1]
}
