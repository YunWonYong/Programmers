const solution = (d, budget) => {
    d.sort((prev, next) => prev - next);
    let answer = 0;
    let temp = 0;
    while((temp+= d.shift()) <= budget){
        answer++;
    }
    return answer;
};
solution([1,3,2,5,4], 9) === 3;
solution([2,2,3,3], 10) ===	4;