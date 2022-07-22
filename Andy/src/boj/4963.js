// 백준, 4963 섬의개수
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

function rec(arr,x2,y2) {
	if(x2<0 || y2<0 || x2>= arr.length || y2 >= arr[0].length || arr[x2][y2] != 1) return;
	arr[x2][y2] = 2;
	for(let xx=-1;xx<=1;xx++) 
		for(let yy=-1;yy<=1;yy++) 
			rec(arr,x2+xx,y2+yy);
}

function landcount(arr) {
	let cnt=0;
	arr.forEach( (d,x) => {
		d.forEach( (d2,y) => {
			if(d2 == 1) {
				cnt++;
				rec(arr,x,y);
			}
		});
	});
	
	return cnt;
}


let w,h,arr;
while(true) {
	[w,h] = it.next().value.split(" ").map(Number);
	if(w == 0 && h==0) break;
	
	arr = [];
	for(let i=0;i<h;i++) {
		let tmp = it.next().value.split(" ").map(Number);
		arr.push(tmp);
	}
	console.log(landcount(arr));
}

