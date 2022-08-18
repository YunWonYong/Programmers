// const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const input = require('fs').readFileSync('예제.txt').toString().split('\r\n');

const n = +input[0];
let question = input[1].split(' ').map(Number);
const m = +input[2];

let arr = new Array(n + 1).fill(0);
let check = new Array(n + 1).fill('X');
for (let i = 3; i < m + 3; i++) {
    let temp = input[i].split(' ');
    let parent = +temp[0];
    let child = +temp[1];
    arr[child] = parent;
}

function seek(question) {
    let result = -1;
    question.forEach(value => {
        while (true) {
            if (check[value] === 'O') 
                result = 1;

            if (arr[value] === 0) 
                break;
            
            check[value] = 'O'
            value = arr[value];
        }
    });
    
    return result;
}

console.log(seek(question));
