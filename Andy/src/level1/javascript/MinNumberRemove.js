//프로그래머스 Level 1,제일 작은 수 제거하기

function solution(arr) {
    if(arr.length<=1) return [-1];
    arr.splice(arr.indexOf(Math.min(...arr)) ,1);
    return arr;
}