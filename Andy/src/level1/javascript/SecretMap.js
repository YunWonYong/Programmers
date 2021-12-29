//프로그래머스 Level 1,[1차] 비밀지도

function solution(n, arr1, arr2) {  
    var answer = [];
    for(var i=0;i<n;i++) {
        var x = (arr1[i] | arr2[i]).toString(2);
        answer.push(" ".repeat(n-x.length) + x.replace(/0/g," ").replace(/1/g,"#"));
    }
    return answer;
}