// 백준, 9465, 스티커
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

function* getcycle(lines) {
	let index=0;
	while(true) {
		yield lines[index++];
	}
}
var it = getcycle(lines);

let n=parseInt(it.next().value);
for(let i=0;i<n;i++) {
	let x = parseInt(it.next().value);
	let arr = [];
	arr[0] = it.next().value.split(" ").map(Number);
	arr[1] = it.next().value.split(" ").map(Number);
	
	let res = [];
	res.push( [0, arr[0][0], arr[1][0] ]);
	for(let j=1;j<x;j++) {
		let tmp = [];
		tmp[0] = Math.max(res[j-1][1],res[j-1][2]);
		tmp[1] = Math.max(res[j-1][0],res[j-1][2]) + arr[0][j];
		tmp[2] = Math.max(res[j-1][0],res[j-1][1]) + arr[1][j];
		res.push(tmp);
	}
	console.log(Math.max(...res[x-1]));
}