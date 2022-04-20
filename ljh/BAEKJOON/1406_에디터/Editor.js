// 1406 에디터

const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

const word = input[0];
let index = 2;
const num = parseInt(input[1]) + index;
const left = [...word];
const right = [];

while(index < num) {
    const command = input[index][0];
    switch(command) {
        case 'L':
            if(left.length) 
                right.push(left.pop());
            break;
        case 'D':
            if(right.length)
                left.push(right.pop());
            break;
        case 'B':
            if(left.length)
                left.pop();
            break;
        case 'P':
            left.push(input[index][2]);
            break;
    } 
    index++;
}

console.log(left.concat(right.reverse()).join(''));