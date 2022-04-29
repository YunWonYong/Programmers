process.stdin.resume();
process.stdin.setEncoding('utf8');

// 백준, 1560, 비숍
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


function proc(input) {
	let x = BigInt(input[0]);
    if(x == 1n) { console.log(1); return; }
	let y = x * 2n - 2n;
	console.log(y.toString());
}
