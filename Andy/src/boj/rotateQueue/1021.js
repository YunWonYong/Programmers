process.stdin.resume();
process.stdin.setEncoding('utf8');

// 백준, 1021, 회전하는 큐
const readline = require("readline");
const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

let input = [];

rl.on("line", function(line) {
	input.push(line)
}).on("close", function() {
	proc(input);
	process.exit();
});


function proc(inputArr) {
	function pop(d) {
		let fidx = arr.indexOf(d);
		let len = Math.abs(fidx-idx);
		if((arr.length/2)>>0 < len) len = arr.length - len;
		arr.splice(fidx,1);
		idx = fidx;	
		return len;
	}
	
	function solution(arr2) {
		move = 0;		
		for(let i=0;i<cnt;i++) move += pop(arr2[i]);
		return move;
	}	
	
	var idx = 0;
	let tmp = inputArr[0].split(" ").map(Number);
	var n = tmp[0];
	var cnt = tmp[1];
	var arr = Array.from({length:n},(d,i) =>i+1);
	arrm = inputArr[1].split(" ").map(Number);
	console.log(solution(arrm));
}

