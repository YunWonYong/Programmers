// 1021 회전하는 큐

let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let first = input[0].split(' ').map(el => parseInt(el));
let n = first[0];
let m = first[1];
let numbers = input[1].split(' ').map(el => parseInt(el));

let now = 1;
let deleted = [];
let one = 0;
let dup = 0;
let answer = 0;
for (let i = 0; i < m; i++) {
    if (now <= numbers[i]) {
        deleted.forEach(num => {
            if (now <= num && num <= numbers[i]) 
                dup++;
        })
        one = numbers[i] - now - dup;
    } else {
        deleted.forEach(num => {
            if (numbers[i] < num && num < now) 
                dup++;
        })
        one = now - numbers[i] - dup;
    }
    let other = n - one;
    n--;
    dup = 0;
    answer += other > one ? one : other;
    deleted.push(numbers[i]);
    now = numbers[i] + 1;
}
console.log(answer);