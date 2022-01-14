function solution(s) {
  return s
    .split(" ")
    .map(convert)
    .join(" ")
}

function convert(word) {
  return word
    .split("")
    .map(helper)
    .join("")
}

function helper(element, index) {
  if (index % 2 == 0)
    return element.toUpperCase()
  else
    return element.toLowerCase()
}
