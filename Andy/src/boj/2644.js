// 백준, 2644, 촌수계산
// https://www.acmicpc.net/problem/2644
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
//--------------------------------------------------------------------
let a,b,x,y;
let arr = Array.from({length:parseInt(it.next().value)+1},() =>0);

[a,b] = it.next().value.split(" ").map(Number);
let cnt = parseInt(it.next().value);
for(let i=0;i<cnt;i++) {
	[x,y] = it.next().value.split(" ").map(Number);
	arr[y] = x;
}

let arr1 = getParentList(arr,a);
let arr2 = getParentList(arr,b);

if(arr1[arr1.length-1] != arr2[arr2.length-1]) {
	result = -1;
}
else {
	while(true) {
		if(arr1.pop() != arr2.pop()) {
			result = (arr1.length + arr2.length) + 2;
			break;
		}
		if(arr1.length == 0 || arr2.length == 0) {
			result = (arr1.length + arr2.length);
			break;
		}
	}
}

console.log(result);

function getParentList(arr,node) {	
	let tarr = [];	
	tarr.push(node);
	while(true) {
		if(arr[node] == 0) return tarr;
		node = arr[node];
		tarr.push(node);
	}
}

