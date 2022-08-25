// 백준, 1388, 바닥 장식
// https://www.acmicpc.net/problem/1388
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
//--------------------------------------------------------------
const HORIZONTAL = 0;
const VERTICAL = 1;
function fill(arr,x,y,pattern,idx) {
	if(idx === HORIZONTAL) {
		for(let i=y;i<arr[x].length;i++) {
			if(arr[x][i] === pattern) arr[x][i] = "X";
			else break;
		}
	}
	else if(idx === VERTICAL) {
		for(let i=x;i<arr.length;i++) {
			if(arr[i][y] === pattern) arr[i][y] = "X";
			else break;
		}
	}
}

function floor_count(arr) {
	let cnt=0;
	let tp = ["-", "|" ];
	arr.forEach( (d,x) => {
		d.forEach( (d2,y) =>{
			tp.forEach( (pattern,idx) => {
				if(d2 === pattern) {
					cnt++
					fill(arr,x,y,pattern,idx);
				}	
			});
		});
	});
	return cnt;
}


let w,h,arr;
[h,w] = it.next().value.split(" ").map(Number);

arr = [];
for(let i=0;i<h;i++) {
	let tmp = it.next().value.split("");
	arr.push(tmp);
}

console.log(floor_count(arr));
