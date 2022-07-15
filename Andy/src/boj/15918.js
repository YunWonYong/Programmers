// 백준, 15918, 랭퍼든 수열쟁이야!!
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let x,y,n;
[n,x,y] = lines[0].split(" ").map(Number);
step = Math.abs(y-x) - 1;
a=Array.from({length:n*2+1},() =>0);
a[x] = a[y] = step;
count = 0;

function rec(arr,n) {
	if(n===0) { count++; return; }
	if(n == step) {
		rec(arr,n-1);
	}
	else {
		for(let i=1;i<arr.length;i++) {
			let idx = i+n+1;
			if(idx < arr.length && arr[i]===0 && arr[idx] === 0) {
				let a2 = arr.slice();
				a2[i] = a2[idx] = n;
				rec(a2,n-1);
			}
		}
	}
}
rec(a,n);
console.log(count);