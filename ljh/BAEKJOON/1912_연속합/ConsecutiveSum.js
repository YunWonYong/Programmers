// 1912 연속합
// const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const input = require('fs').readFileSync('예제.txt').toString().split('\n');
const n = parseInt(input[0]);

const progression = input[1].split(' ').map(Number);
let last = progression.length - 1;
let now = progression[last--];
let max = now;

for (let i = last; i >= 0; i--) {
    now = Math.max(progression[i] + now, progression[i]);
    if (now > max) {
        max = now;
    }
}

console.log(max);


