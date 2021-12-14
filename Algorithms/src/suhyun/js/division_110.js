function solution(arr, divisor) {
    let count =0;
    var answer = [];
    for (let i = 0; i < arr.length; i++){
        if (arr[i] % divisor== 0) { 
        answer[count]=arr[i];
        count++;
        }
    }
    if (answer.length == 0) { 
        answer[0] = -1;
    
    }
// 오름차순 정리  sort()하면 1이랑 10이랑 엉켜서 앞뒤차이로 작은 수 큰 수 구분해서 정렬 
answer.sort((a,b)=>a-b);
    return answer;
}
