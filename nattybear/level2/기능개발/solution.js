function solution(progresses, speeds) {
  return deploy(zip_with(days, progresses, speeds))
    .map(x => x.length)
}

function days(progress, speed) {
  todo = 100 - progress
  quotient = Math.floor(todo / speed)
  remainder = todo % speed
  if (remainder == 0)
    return quotient
  else
    return quotient + 1
}

function zip_with(f, xs, ys) {
  const zs = []
  for (let i = 0; i < xs.length; i++) {
    let x = xs[i]
    let y = ys[i]
    let z = f(x, y)
    zs.push(z)
  }
  return zs
}

function group_by(f, xs) {
  const yys = []
  let ys = []
  for (let i = 0; i < xs.length; i++) {
    let a = xs[i]
    let b = xs[i+1]
    if (f(a, b)) {
      ys.push(a)
    }
    else {
      ys.push(a)
      yys.push(ys)
      ys = []
    }
  }
  return yys
}

function deploy(xs) {
  return group_by((x,y) => x >= y, xs)
}

progresses = [93, 30, 55]
speeds = [1, 30, 5]

console.log(solution(progresses, speeds))
