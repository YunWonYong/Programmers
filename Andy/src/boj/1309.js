// 백준 1309, 동물원
// https://www.acmicpc.net/problem/1309
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let MAX = 9901;
let n=Number(lines[0]);
dp = [[]];
dp.push(Array());
dp[1][0] = dp[1][1] = dp[1][2] = 1;
for(let i=2;i<=n;i++) {
    dp.push(Array());
    dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%MAX;
    dp[i][1] = (dp[i-1][0] + dp[i-1][2])%MAX;
    dp[i][2] = (dp[i-1][0] + dp[i-1][1])%MAX;
}
console.log((dp[n][0]+dp[n][1]+dp[n][2])%MAX);