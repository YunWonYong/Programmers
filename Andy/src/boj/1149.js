process.stdin.resume();
process.stdin.setEncoding('utf8');

// 백준, 1149, RGB거리
const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = Number(lines[0]);

let r,g,b;
let sum=[];

sum[0] = [0,0,0];
for(let i=1;i<=n;i++) {
	[r,g,b] = lines[i].split(" ").map(Number);
	sum[i] = [ r+Math.min(sum[i-1][1],sum[i-1][2]),
			g+Math.min(sum[i-1][0],sum[i-1][2]),
			b+Math.min(sum[i-1][0],sum[i-1][1]),
		]
}
console.log(Math.min(...sum[n]));