//프로그래머스 Level 1,행렬의 덧셈
function solution(arr1, arr2) {
    var answer = [[]];
    arr1.forEach( (d,i) => {
        answer[i] = [];
        d.forEach( (d2,i2) => {            
            answer[i][i2] = d2 + arr2[i][i2]; 
        });  
    });
    return answer;
}