//프로그래머스 Level 1,정수 제곱근 판별
function solution(n) {
    var answer = 0;
    answer = parseInt(Math.sqrt(n))
    if(answer**2 == n) return (answer+1)**2;
    return -1;
}