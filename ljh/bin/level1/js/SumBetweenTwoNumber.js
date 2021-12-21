let a = 3;
let b = 5;
let answer = solution(a, b);
console.log(answer);

function solution(a, b) {
    var answer = 0;
    let max = b;
    let min = a;
    
    if(a>b){
        max = a;
        min = b;
    }
    for(let i=min; i<=max; i++){
        answer += i;
    }
    
    return answer;
}