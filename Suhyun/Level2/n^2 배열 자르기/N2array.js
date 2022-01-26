let n=3;
let left=2;
let right=5;
let answer=[];

for(let i=left ; i<=right;i++){
    answer.push(Math.floor(Math.max(i/n,i%n)+1));
}


