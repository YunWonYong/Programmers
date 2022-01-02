function solution(s, n) {
  return s
    .split('')
    .map(x => caesar(x, n))
    .join('')
}

function caesar(c, n) {
  if (c == ' ')
    return c
  let array = []
  if ('a' <= c && c <= 'z')
    array = lower
  else
    array = upper
  const index = (array.indexOf(c) + n) % 26
  return array[index]
}

const upper = range('A', 'Z')
const lower = range('a', 'z')

function range(start, end) {
  const xs = []
  for (let i = ord(start); i <= ord(end); i++)
    xs.push(String.fromCharCode(i))
  return xs
}

function ord(c) {
  return c.charCodeAt(0)
}
