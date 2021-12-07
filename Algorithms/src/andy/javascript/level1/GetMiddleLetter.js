//프로그래머스 Level 1,가운데 글자 가져오기

function solution(s) {
    return s.substr((s.length-1)/2,2-s.length%2);
}