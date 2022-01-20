let n=118372
let answer=parseInt(n.toString().split('').sort((a,b)=>b-a).join(''));
console.log(answer)