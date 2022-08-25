// 백준, 1541, 잃어버린 괄호 
// https://www.acmicpc.net/problem/1541
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let arr = [];

str = lines[0];
ar = [];
fin = 0;
str.split("-").forEach( (d) => {
    let sum = d.split("+").map(Number).reduce( (a,d,i) => a+d );  
    if(fin == 0) fin = sum;
    else 
    	ar.push(sum);
});

ar.forEach( (d) => { fin -= d; });
console.log(fin);