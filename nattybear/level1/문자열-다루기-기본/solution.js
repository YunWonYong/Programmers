function solution(s) {
  return four_or_six(s) && all_digit(s)
}

function four_or_six(s) {
  const size = s.length
  return size == 4 || size == 6
}

function digit(c) {
  return ('0' <= c && c <= '9')
}

function all_digit(s) {
  return s.split('').every(digit)
}
