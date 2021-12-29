//프로그래머스 Level 1, 문자열 내 p와 y의 개수
function solution(s){
    var p = s.match(/P/ig);   
    var y = s.match(/Y/ig);
    return ((p?p.length:0) == (y?y.length:0));
}