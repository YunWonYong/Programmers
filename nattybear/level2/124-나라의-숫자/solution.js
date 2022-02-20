function solution(n) {
  const xs = []
  while (true) {
    if (n == 0) {
      break
    }
    if (n < 3) {
      xs.unshift(n)
      break
    }
    let rem = n % 3
    let quo = Math.floor(n / 3)
    if (rem == 0) {
      quo = quo - 1
      rem = 3
    }
    xs.unshift(rem)
    n = quo
  }
  return xs.join('').replace(/3/g, '4')
}
