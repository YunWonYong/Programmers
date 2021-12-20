//프로그래머스 Level 1, 예산
function solution(d, budget) {
    let answer = 0;
    let sum = 0;   
    d.sort((a,b)=>{return a-b});
    d.some( x => {
        sum += x;
        if(sum>budget) return true;
        answer++;
    });
    return answer;
}