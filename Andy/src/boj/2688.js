// 백준, 2688, 줄어들지 않아
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

function getArray() {
    let sum = [ 0,10 ];
	let arr = Array.from({length:11},(d,i) =>i);
	for(let i=2;i<=64;i++) {
		for(let j=2;j<=10;j++) {
			arr[j] = arr[j] + arr[j-1];
		}
		sum[i] = arr[10];
	}
	return sum;
}


let sum = getArray();
let tmp = lines.map(Number);
for(let x=1;x<=tmp[0];x++)
	console.log(sum[tmp[x]]);

