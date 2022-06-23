// 백준, 1334, 다음 팰린드롬 수
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')


function reverseNum(x) {
	let b = x.toString();
	let b2 = [...b.substring(0, b.length/2)].reverse().join("");
	let b3 = b.substr(0,(b.length+1)/2) + b2;
	let y = BigInt(b3);
	return y;
}

function bigNumCenterAdd(x) {
	let b = x.toString();
	let y = BigInt("1" + "0".repeat(parseInt(b.length/2)));
	return x + y;
}

function nextNumber(x) {
	let x2 = reverseNum(x);
	if(x2 > x) return x2;
	x = bigNumCenterAdd(x);
	x2 = reverseNum(x);
	return x2;
}



let x = BigInt(lines[0]);
x = nextNumber(x);
console.log(x.toString());