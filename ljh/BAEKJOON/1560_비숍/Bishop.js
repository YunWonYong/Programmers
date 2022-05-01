// 1560 비숍

const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

if (input[0] == 1) {
    console.log(1);
} else {
    console.log((2n * BigInt(input[0]) - 2n).toString());
}


