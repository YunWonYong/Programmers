//프로그래머스 Level 1,나누어 떨어지는 숫자 배열

function solution(arr, divisor) {
    var answer = [];
    answer = arr.filter( (d) => { return (d%divisor == 0); }).sort( (a,b) => { return a-b;}  );
    if(answer.length==0) answer.push(-1);
    return answer;
}