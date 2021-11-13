// 프로그래머스 Level 1,체육복
function solution(n, lost, reserve) {
    var answer = 0;
    var arr = Array.from({length:n},() =>1);
	reserve.forEach( (d)=>arr[d-1]++);
	lost.forEach( (d)=>arr[d-1]--);
    arr.forEach(function(d,i) { 
        if(d == 0) {
            if(arr[i-1]>1) answer++;
            else if(arr[i+1]>1) { answer++; arr[i+1]--; }
        }
        else answer++;
    });
    return answer;
}