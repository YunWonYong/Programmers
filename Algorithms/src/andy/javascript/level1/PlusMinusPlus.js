function solution(absolutes, signs) {
    var answer = 0;
    absolutes.forEach( (d,i) => { 
        answer += (signs[i]?d:-d);
    });
    return answer;
}