// 백준, 1074,Z
// https://www.acmicpc.net/problem/1074
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

var n,r,c,sum=0;
[n,r,c] = lines[0].split(" ").map(Number);
function findLoc(n,r,c) {
    let center = Math.pow(2,n)/2 -1;
    let val=0;
    if(center<c) val=1;
    if(center<r) val+=2;
    return val;
}
function foo(n,r,c) {
    let loc = findLoc(n,r,c);
    if(n==1) {
        sum += loc;        
        return;
    }
    let mid = Math.pow(2,n-1);
    sum += (loc * mid * mid);
    if(r>=mid) r -= mid;
    if(c>=mid) c -= mid;
    foo(n-1,r,c);
}
foo(n,r,c)
console.log(sum);
