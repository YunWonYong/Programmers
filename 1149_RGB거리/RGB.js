//1149 RGB 거리
const input = require('fs').readFileSync('예제.txt').toString().split('\r\n');
const n = parseInt(input[0]);

const arr = [];
arr[0] = [];
for (let i = 1; i <= n; i++) {
    arr[i] = input[i].split(' ').map((value) => parseInt(value));
}
const f = [];
f.push([0,0,0]);

for (let i = 1; i <=n; i++) {
    f[i] = new Array(3);
    f[i][0] = arr[i][0] + Math.min(f[i-1][1], f[i-1][2]);
    f[i][1] = arr[i][1] + Math.min(f[i-1][0], f[i-1][2]);
    f[i][2] = arr[i][2] + Math.min(f[i-1][0], f[i-1][1]);
}

console.log(Math.min(f[n][0], f[n][1], f[n][2]));