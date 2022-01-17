//프로그래머스 Level 1,정수 내림차순으로 배치하기
function solution(n) {
    return Number([...n.toString()].sort().reverse().join(""));
}