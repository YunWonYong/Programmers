// 프로그래머스 Level 1,부족한 금액 계산하기
function solution(price, money, count) {
    var answer = 0;

    for(let i=1;i<=count;i++)
        answer += (price*i);
    answer -= money;
    return answer>0?answer:0;
}