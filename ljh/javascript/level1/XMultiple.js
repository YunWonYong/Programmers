// x만큼 간격이 있는 n개의 숫자(220129 - 220204)
function solution(x, n){
    let answer = [];
    let count = 1;
    while(count <= n){
        answer.push(x*count++);
    }
    return answer;
}