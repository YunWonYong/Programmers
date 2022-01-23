//프로그래머스 Level 1,하샤드 수

function solution(x) {
    if(x % digit_sum(x) == 0) return true;
    return false;
}

function digit_sum(x) {
    if(x<1) return x;
    return x%10 + digit_sum(parseInt(x/10));
}