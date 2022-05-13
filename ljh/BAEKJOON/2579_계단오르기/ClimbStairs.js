//2579 계단 오르기
// const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const input = require('fs').readFileSync('예제.txt').toString().split('\r\n');
const n = parseInt(input[0]);
const arr = [];

for (let i = 1; i <= n; i++) {
    arr.push(parseInt(input[i]));
}

if (n < 3) {
    switch(n) {
        case 1:
            console.log(arr[0]);
            break;
        case 2:
            console.log(arr[1] + arr[0]);
            break;
        case 3:
            console.log(arr[2] + Math.max(arr[0], arr[1]));
            break;
    }
} else {
    const f = [];
    f.push(arr[0]);
    f.push(arr[1] + arr[0]); //f(1);
    f.push(arr[2] + Math.max(arr[0], arr[1])); //f(2);
    
    for(let i = 3; i <n; i++) {
        f.push(arr[i] + Math.max(arr[i-1] + f[i-3], f[i-2]));
    }
    
    console.log(f[n-1]);
    
}

