//프로그래머스 Level 1,이상한 문자 만들기
function solution(s) {
    return s.split(" ").map( (data) => [...data].map( (d,i) => i%2==0?d.toUpperCase():d.toLowerCase()).join("") ).join(" ");
}