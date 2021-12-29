//프로그래머스 Level 1,3진법 뒤집기
function solution(n) {
    return parseInt([...n.toString(3)].reverse().join(''), 3);
}