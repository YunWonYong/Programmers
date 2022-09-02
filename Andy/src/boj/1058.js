// 백준, 1058, 친구
process.stdin.resume();
process.stdin.setEncoding('utf8');

const fs = require('fs')
const lines = fs.readFileSync('/dev/stdin').toString().split('\n')

let n=Number(lines[0]);
let arr= [];
for(let i=1;i<=n;i++) {
    let tmp = [];
    lines[i].split("").forEach( (d,j) => {
        if(d == "Y") {
            tmp.push(j+1);
        }
    });
    arr[i] = tmp;
}
let max = 0;
arr.forEach( (d,i) => {
    let set = new Set();
    d.forEach( (d2,i2) => set.add(d2) );
    [...set].forEach( (d3) => { 
        arr[d3].forEach( (d2,i2) => set.add(d2) );
    });
    max = Math.max(max,set.size-1);
});
console.log(max);