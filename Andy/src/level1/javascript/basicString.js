//프로그래머스 Level 1,문자열 다루기 기본

function solution(s) {
    return (s.length == 4 || s.length == 6) && [...s].every( (d) => { return d>='0' && d<='9' }) ;
}