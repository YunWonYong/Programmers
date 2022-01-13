//프로그래머스 Level 1,약수의 합
function solution(n) {
    let answer = n;
    for(let i=1;i<n;i++)
        if(n%i == 0) answer += i;
    return answer;
}