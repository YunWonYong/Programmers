// 프로그래머스 Level 1,체육복
function solution(n, lost, reserve) {
    var answer = 0;
    var arr = Array.from({length:n},() =>1);
	
    reserve.forEach(function(item) { arr[item-1]++ });
    lost.forEach(function(item) { arr[item-1]-- });
    arr.forEach(function(item,idx) { 
        if(item == 0) {
            if(arr[idx-1]>1) answer++;
            else if(arr[idx+1]>1) { answer++; arr[idx+1]--; }
        }
        else answer++;
    });

    return answer;
}