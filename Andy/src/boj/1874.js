// 백준, 1874, 스택 수열
// https://www.acmicpc.net/problem/1874
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n=Number(lines[0]);
let arr = [];
for(let i=n;i>=1;i--) 
	arr.push(Number(lines[i]));


let str = "";	
let arr2 = [];	
for(let i=1;i<=n;i++) {
	arr2.push(i);
	str += "+\n";

	for(;;) {
		if(arr.length === 0 || arr2.length === 0) break;
		let src = arr[arr.length-1];
		let dest = arr2[arr2.length-1];
		if(src == dest) {
			arr.pop();
			arr2.pop();
			str += "-\n";
		}
		else break;
	}
}	
if(arr.length !== 0 || arr2.length !== 0) str = "NO";
console.log(str);