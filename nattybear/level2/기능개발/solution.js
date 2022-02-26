function solution(progresses, speeds) {
  return group(zip_with(days, progresses, speeds))
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

function group(xs) {
  const yys = []
  let ys = []
  for (let i = 0; i < xs.length; i++) {
    let x = xs[i]
    if (ys.length == 0) {
      ys.push(x)
      continue
    }
    if (ys[0] >= x) {
      ys.push(x)
    }
    else {
      yys.push(ys)
      ys = [x]
    }
  }
  yys.push(ys)
  return yys
}
