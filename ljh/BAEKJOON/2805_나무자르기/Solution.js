// const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const input = require('fs').readFileSync('예제.txt').toString().split('\r\n');

const condition = input[0].split(' ').map(Number);
const n = condition[0];
const m = condition[1];

const forest = input[1].split(' ').map(Number);

// 이진 탐색
// m의 최소, 최대값
let right = 2000000000;
let left = 1;

while(left <= right) {
    let mid = Math.floor((left + right) / 2);
    let result = felling(forest, mid);

    if (result < m) {
        right = mid - 1;
    } else {
        left = mid + 1;
    }
    console.log(`result : ${result} left : ${left} right : ${right} mid : ${mid} `)
}

console.log(right);

function felling (forest, height) {
    let output = 0;
    for (let tree of forest) {
        if (tree <= height) {
            continue;
        }

        output += (tree - height);
    }
    return output;
}