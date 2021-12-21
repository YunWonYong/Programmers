//프로그래머스 Level 1, 문자열 내림차순으로 배치하기
function solution(s) {
    return [...s].sort( (a,b) => {
        if(a == b) return 0;
        if(a>b) return -1;
        return 1;
    }).join('');
}