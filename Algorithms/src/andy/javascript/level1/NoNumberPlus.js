function solution(numbers) {
    var answer = 0;
    for(let i=1;i<10;i++) {
        if(numbers.indexOf(i) == -1) answer += i;
    }
    return answer;
}