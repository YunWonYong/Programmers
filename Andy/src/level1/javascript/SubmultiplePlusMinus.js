// 프로그래머스 Level 1,약수의 개수와 덧셈
function solution(left, right) {
    var answer = 0;
    for(let i=left;i<=right;i++) {
        let cnt = 1;
        for(let j=1;j<=i/2;j++) {
            if(i%j == 0) cnt++;
        }
        answer += (cnt%2==0?i:-i); 
    }
    return answer;
}