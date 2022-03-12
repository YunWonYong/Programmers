class Counter extends Map {
  constructor(xs) {
    super()
    if (xs == undefined)
      return
    for (let x of xs)
      this.count(x)
  }

  count(s) {
    if (this.get(s))
      this.set(s, this.get(s) + 1)
    else
      this.set(s, 1)
  }

  intersect(c) {
    const d = new Counter()
    this.forEach((v, k) => {
      if (c.get(k))
        d.set(k, Math.min(v, c.get(k)))
    })
    return d
  }

  unify(c) {
    c.forEach((v, k) => {
      if (this.get(k))
        this.set(k, Math.max(v, this.get(k)))
      else
        this.set(k, v)
    })
  }

  to_list() {
    const xs = []
    this.forEach((v, k) => {
      for (let i = 0; i < v; i++)
        xs.push(k)
    })
    return xs
  }
}

function solution(str1, str2) {
  const j = jaccard(str1.toLowerCase(), str2.toLowerCase())
  return Math.floor(j * 65536)
}

function jaccard(s, t) {
  const xs = multiset(s)
  const ys = multiset(t)
  if (xs.length == 0 && ys.length == 0)
    return 1
  const intersection = intersect(xs, ys)
  const union = unify(xs, ys)
  return intersection.length / union.length
}

function multiset(s) {
  const xs = []
  let x = ""
  for (let i = 0; i < s.length-1; i++) {
    let a = s.charAt(i)
    let b = s.charAt(i+1)
    if (!alpha(a) || !alpha(b))
      continue
    x = x + a + b
    xs.push(x)
    x = ""
  }
  return xs
}

function alpha(c) {
  return 'a' <= c && c <= 'z'
}

function intersect(xs, ys) {
  const c = new Counter(xs)
  const d = new Counter(ys)
  return c.intersect(d).to_list()
}

function unify(xs, ys) {
  const c = new Counter(xs)
  const d = new Counter(ys)
  c.unify(d)
  return c.to_list()
}
