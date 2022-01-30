//프로그래머스 Level 1,x만큼 간격이 있는 n개의 숫자
function solution(x, n) {
    var answer = [];
    for(let i=1;i<=n;i++)
        answer.push(x*i);
    return answer;
}