//프로그래머스 Level 1, 문자열 내 마음대로 정렬하기
function solution(strings, n) {
    var answer = [];
    answer = strings.sort( (a,b) => {        
        if(a[n] == b[n])  
            return a.localeCompare(b);
        else 
            return a[n].localeCompare(b[n]);
    });
    return answer;
}