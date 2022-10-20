let input = require('fs').readFileSync('예제.txt').toString();

input += '+';
let str = '';
let flag = true;
const plusList = [];
const minusList = [];

for (let c of input) {
    switch(c) {
        case '+':
            flag? plusList.push(Number(str)) : minusList.push(Number(str));
            str = '';
            break;
        case '-':
            flag? plusList.push(Number(str)) : minusList.push(Number(str));
            flag = false;
            str = '';
            break;
        default: 
            str += c;
    }
}

function calculateTotal(list) {
    return list.reduce((prev, curr) => prev + curr, 0);
}

console.log(calculateTotal(plusList) - calculateTotal(minusList));