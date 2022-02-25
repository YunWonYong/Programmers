//프로그래머스 Level 2,124 나라의 숫자
function solution(n) {
    var answer = '';
    while(n!=0) {
        let mod = n%3;
        answer = (mod==0?4:mod) + answer;
        n = Math.floor(n/3) - (mod==0?1:0);
    }
    return answer;
}