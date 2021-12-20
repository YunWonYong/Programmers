const solution = arr => {    
    const answer = [arr[0]];
    arr.reduce((prev, next) => {
        if (prev != next) {
            answer.push(next);
        }
        return next;
    });
    return answer;
};