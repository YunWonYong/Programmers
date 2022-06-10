// 2302 극장좌석
// const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const input = require('fs').readFileSync('예제.txt').toString().split('\n');
const n = parseInt(input[0]);
const m = parseInt(input[1]);

const f = [1, 1];
for (let i = 2; i < 41; i++) {
    f[i] = f[i-1] + f[i-2];
}

let last = 2 + m;
let now = 1;
let answer = 1;
let index = 0;

for (let i = 2; i < last; i++) {
    let vip = parseInt(input[i]);
    index = vip - now;
    now = vip + 1;
    answer *= f[index];
}

answer *= f[n + 1 - now];
console.log(answer);


