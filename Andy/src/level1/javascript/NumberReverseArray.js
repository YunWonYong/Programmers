//프로그래머스 Level 1,자연수 뒤집어 배열로 만들기
function solution(n) {
    return [...(""+n)].map(Number).reverse();
}