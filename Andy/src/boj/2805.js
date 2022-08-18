// 백준, 2805, 나무 자르기
// https://www.acmicpc.net/problem/2805
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let arr = [];

var n,m;
[n,m] = lines[0].split(" ").map(Number);

// tree, treeidx 
let treetmp = lines[1].split(" ").map(Number);
let tree = [];
treetmp.forEach( (d) => tree[d] = tree[d]?tree[d]+1:1 );
let treeidx = [...new Set(treetmp)].sort( (a,b) => b-a );
tree[0] = 1;
treeidx.push(0);

len2 = 0;	// 윗단계의 총 나무 길이의합 
prevd = 0;	// 윗단계의 나무번호
treecnt=0;	// 뭉쳐있는 나무 갯수

treeidx.some( (d) => cal(d));

function cal(d) {
	let len = treecnt * (prevd-d); // 현재단계의 나무합 	
	if(m <= len2 + len) {
		let max = prevd;
		let min = d;
	
		while(true) {
			if(min == max) {
				console.log(min);
				break;
			}
		    let mid = Math.ceil((max+min)/2);
		    let val = len2 + treecnt * (prevd - mid);
		    if(val>m) min = mid;
		    else if(val<m) max = mid-1;
		    else {
		    	console.log(mid);
		    	break;
		    }
		}		
		return true;
	}
	
	prevd = d;
	len2 += len;
	treecnt += tree[d];
	return false;
}
