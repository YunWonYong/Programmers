// 백준, 2302, 극장 좌석 
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n = Number(lines[0]);
let m = Number(lines[1]);

let arr = Array.from({length:n+1},()=>0);

for(let i=2;i<=m+1;i++) {
	let tmp = Number(lines[i]);
	arr[tmp]=1;
}

let sum = 1;
let cnt=0;
for(let i=1;i<=n;i++) {
	if(arr[i] === 0) cnt++;
	else {
		sum *= getFibo(cnt);
		cnt = 0;
	}
}
sum *= getFibo(cnt);

console.log(sum);

function getFibo(cnt) {
	let arr=[ 1,1,2 ];
	if(cnt<2) return arr[cnt];
	for(let i=2;i<=cnt;i++) {
		arr[i] = arr[i-1] + arr[i-2];
	}
	return arr[cnt];
}