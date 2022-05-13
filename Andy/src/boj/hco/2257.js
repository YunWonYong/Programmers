process.stdin.resume();
process.stdin.setEncoding('utf8');

//백준, 2257, 화학식량
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

idx = -1;

function proc(input) {
	arr = [...input[0]];
	let answer = foo();
	console.log(answer);
}

function getWeight(ch,num){
	let sum=0;
	if(ch == "H") sum+=1;
	else if(ch == "C") sum+=12;
	else if(ch == "O") sum+=16;
	else return 0;
	
    if(isNaN(num)=== false) {
        sum *= Number(num);
    }	
	return sum;
}

function foo() {
	let sum = 0;
	while(true) {
		idx++;
		if(idx>=arr.length) return sum;
		sum += getWeight(arr[idx],arr[idx+1]);
		if(arr[idx] == "(") 
			sum += foo();
		else if(arr[idx] == ")") {
			if(isNaN(arr[idx+1]) === false) {
				sum *= Number(arr[idx+1]);
				idx++;
			}
			return sum;
		}
	}
	
}