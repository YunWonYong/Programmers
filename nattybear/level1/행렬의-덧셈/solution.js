function solution(arr1, arr2) {
  return add_matrix(arr1, arr2)
}

function add_matrix(m, n) {
  return zipWith(add_vector, m ,n)
}

function add_vector(v, w) {
  return zipWith((x,y) => x + y, v, w)
}

function zipWith(f, xs, ys) {
  if (xs.length == 0)
    return []
  return [f(xs[0], ys[0])].concat(zipWith(f, xs.slice(1), ys.slice(1)))
}
