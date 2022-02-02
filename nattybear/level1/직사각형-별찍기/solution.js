process.stdin.setEncoding('utf8')
process.stdin.on('data', data => {
  const pair = data.split(" ")
  const n = Number(pair[0])
  const m = Number(pair[1])
  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      process.stdout.write("*")
    }
    console.log("")
  }
})
