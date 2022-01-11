function solution(n, left, right) {
  const rows = []
  const row = []

  for (let i = 0; i < n; i++)
    row.push(undefined)

  for (let i = 0; i < n; i++)
    rows.push(row.map((x) => x))

  for (let i = 0; i < n; i++)
    for (let j = 0; j < n; j++)
      rows[i][j] = j + 1

  for (let i = 0; i < n; i++)
    for (let j = 0; j < i; j++)
      rows[i][j] = i + 1

  let line = []

  for (let row of rows)
    line = line.concat(row)

  return line.slice(left, right+1)
}
