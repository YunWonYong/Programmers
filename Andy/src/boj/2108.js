// 백준, 2108, 통계학 
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n=Number(lines[0]);
let arr= [];
var set = new Set();
let sum=0;
for(let i=1;i<=n;i++) {
	let tmp = Number(lines[i]);
	arr[tmp] = arr[tmp]?arr[tmp]+1:1;
    set.add(tmp);
    sum += tmp;
}
let arr2 = [...set].sort((a,b)=>a-b);

// 평균
let mean = Math.round(sum/n);
if(mean === 0) mean=0;

// 중앙값
let cnt=0;
let mid = parseInt(n/2) + 1;
let mode = 0;
let mx = 0;
arr2.forEach( (d) => {
	if(mid >= (cnt+1)) mode = d;
	cnt += arr[d];
	mx = Math.max(mx, arr[d]);
});

// 최빈값
median = 0;
arr3 = arr2.filter( (d) => mx == arr[d]);
median = arr3.length==1?arr3[0]:arr3[1];

// 범위
let scope = arr2[arr2.length-1] - arr2[0];

// 평균 : mean
// 중앙값 : mode
// 최빈값 : median 
// 범위 : scope
console.log(mean);
console.log(mode);
console.log(median);
console.log(scope);