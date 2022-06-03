// 백준, 3019, 테트리스
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let c,p;
[c,p] = lines[0].split(" ").map(Number);
cboard = lines[1].split(" ").map(Number);

let arr = [];
arr[1] = [ [[0,0],[0,-1],[0,1],[0,2]] , [[0,0],[1,0],[-1,0],[-2,0]] ];
arr[2] = [ [[0,0],[0,-1],[-1,0],[-1,-1]] ];
arr[3] = [ [[0,0],[1,0],[0,-1],[-1,-1]], [[0,0],[0,1],[1,0],[1,-1]] ] ;
arr[4] = [ [[0,0],[-1,0],[0,-1],[1,-1]], [[0,0],[0,-1],[1,0],[1,1]] ];
arr[5] = [ [[0,0],[0,1],[1,0],[-1,0]] , [[0,0],[-1,0],[0,1],[0,-1]], [[0,0],[0,-1],[-1,0],[1,0]] , [[0,0],[1,0],[0,-1],[0,1]] ];
arr[6] = [ [[0,0],[1,1],[1,0],[-1,0]] , [[0,0],[-1,1],[0,1],[0,-1]],[[0,0],[-1,-1],[-1,0],[1,0]],[[0,0],[1,-1],[0,-1],[0,1]] ];
arr[7] = [ [[0,0],[-1,1],[1,0],[-1,0]],[[0,0],[-1,-1],[0,1],[0,-1]],[[0,0],[1,-1],[-1,0],[1,0]],[[0,0],[1,1],[0,-1],[0,1]] ];

let board = [];
for(let i=0;i<10;i++) {
	let tmp = [];
	for(let j=0;j<cboard.length;j++) {
		if(cboard[j] > i) tmp[j] = 1;
		else tmp[j] = 0;		
	}
	board[i] = tmp;
}
 
function getminy(x) {
	return cboard[x];
}
 
function chkdown(tmparr,x,y) {
	for(let i=0;i<tmparr.length;i++) {
		let node = tmparr[i];
		if(node[0] == x && node[1] == y) return true;
	}
	return false;
}
 
function isemptyspace(bx,by,tmparr) {
	for(let i=0;i<tmparr.length;i++) {
		let node = tmparr[i];
		let x = node[0]+bx;
		let y = node[1]+by;
		if(y-1<0) continue;
		if(chkdown(tmparr,node[0],node[1]-1) === false && board[y-1][x] === 0) return false;		
	}
	return true;
}
 
 
// get x
function getx(bx, tmparr) {
	for(let i=0;i<tmparr.length;i++) {
		let node = tmparr[i];
		let tmpx = bx + node[0];
		if(tmpx < 0 || cboard.length <= tmpx) return -999;
	}
 
	let maxy = -1;
	for(let i=0;i<tmparr.length;i++) {
		let node = tmparr[i];
		//console.log(node);
		let x = bx + node[0];
		let y = getminy(x) - node[1];
		//console.log(x + ":" + y);
		if(maxy < y) maxy = y;
	}
	return maxy;
}
 
let cnt = 0;
let barr = arr[p];
for(let i=0;i<barr.length;i++) {
	// console.log(barr[i]);
	for(j=0;j<cboard.length;j++) {
		let x = getx(j,barr[i]);
		if(x>=0) {
			if(isemptyspace(j,x,barr[i]) === true) cnt++;
		}
	}
}
 
console.log(cnt);
 
