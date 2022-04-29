function main() {
  const fs = require("fs")
  const n = BigInt(fs.readFileSync("/dev/stdin"))
  const two = BigInt(2)
  const result = n > two ? two*n - two : n
  console.log(result.toString())
}

main()
