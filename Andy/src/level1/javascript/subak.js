//프로그래머스 Level 1,수박수박수박수박수박수?
function solution(n) {
    var arr = ["수", "박"];
    var answer = '';
    for(let i=0;i<n;i++) answer += arr[i%2];
    return answer;
}