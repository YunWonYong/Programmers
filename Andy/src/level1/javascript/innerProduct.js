function solution(a, b) {
    var answer = 0;
    a.forEach( (d,i) => answer += (d * b[i]));
    return answer;
}