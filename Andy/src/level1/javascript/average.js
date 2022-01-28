//프로그래머스 Level 1,평균 구하기

function solution(arr) {
    return arr.reduce( (a,d) => a+d,0) / arr.length;
}