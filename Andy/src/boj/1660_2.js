// 백준, 1660, 캡틴 이다솜
// https://www.acmicpc.net/problem/1660
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n=Number(lines[0]);
function getArray(n) {
    let a = [];
    a[0] = 1; x = 2;
    for(let i=1;i<122;i++) {
        a[i] = a[i-1] + x;
        x++;
    }
    let s = []; s[0] = 1;
    for(let i=1;i<122;i++) {
        s[i] = s[i-1]+a[i];
        if(s[i] > n) break;
    }
    return s;
}
let s = getArray(n);

dp = [ 0,1 ];
while(dp.length<=n) {
    let min = 300000;
    s.some( (d) => {
        if(dp.length - d<0) return true;
        min = Math.min(min,dp[dp.length - d]);
    });
    dp.push(min+1);    
}
console.log(dp[n]);
    
    