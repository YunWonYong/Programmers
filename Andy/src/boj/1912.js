// 백준, 1912, 연속합
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = Number(lines[0]);
let arr = lines[1].split(" ").map(Number);
let arrsum = [];
arrsum[0] = arr[0];
for(let i=1;i<n;i++) {
	arrsum[i] = arrsum[i-1] + arr[i];
	if(arrsum[i] < arr[i])
		arrsum[i] = arr[i];
}

console.log(Math.max(...arrsum));