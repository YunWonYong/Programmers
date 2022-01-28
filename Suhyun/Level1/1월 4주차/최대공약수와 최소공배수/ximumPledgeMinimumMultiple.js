let n=3
let n=12

let mm=eucl(Math.max(n,m),Math.min(n,m));

n=n/mm;
m=m/mm;

let mp=m*n*mm;
let answer={mm,mp};
console.log(answer);

function eucl(big,small){
    let val = big%small;
    if(val==0){
        return small;
    }
    else{
        return eucl(small,val);
    }
}