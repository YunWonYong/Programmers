process.stdin.resume();
process.stdin.setEncoding('utf8');

//백준, 2579, 계단 오르기
const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

const CONTINUE = 0;
const JUMP = 1;
n = Number(lines[0]);
step=[];
arr=[[],[]];
for(let i=1;i<=n;i++)
	step.push(Number(lines[i]));

arr[CONTINUE][0] = step[0];
arr[CONTINUE][1] = step[0] + step[1];
arr[JUMP][0] = 0;
arr[JUMP][1] = step[1];

for(let i=2;i<n;i++) {
	arr[CONTINUE][i] = arr[JUMP][i-1] + step[i];
	arr[JUMP][i] = Math.max(arr[CONTINUE][i-2],arr[JUMP][i-2]) + step[i];
}
console.log(Math.max(arr[CONTINUE][n-1],arr[JUMP][n-1]));
