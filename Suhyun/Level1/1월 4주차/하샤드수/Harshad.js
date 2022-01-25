let x=13;
let answer;


let num=String(x).split("").reduce(function (a,b){
    return parseInt(a)+parseInt(b);
},0);

return x%num==0 ? true : false;

//return answer=x%num==0 ? true : false;