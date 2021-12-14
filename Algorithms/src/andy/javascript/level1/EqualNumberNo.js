//프로그래머스 Level 1,같은 숫자는 싫어

function solution(arr)
{
    var answer = [];   
    arr.forEach((d,i) => { 
        if(arr[i+1] != d) {
            answer.push(d) 
        }
    });   
    return answer;
}