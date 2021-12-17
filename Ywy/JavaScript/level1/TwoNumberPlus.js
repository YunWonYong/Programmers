const solution = (numbers) =>{
    let index = 0;
    let index2 = 0;
    let num = numbers[index];
    let element = 0;
    const answer = [];
    const range = numbers.length;
    while(true) {
        element = num + numbers[++index2];
        if (index === index2) {
            continue;
        } 
        
        if (index2 === range) {
            if (++index === range) {
                return answer.sort( (prev, next) => prev - next);
            }
            num = numbers[index];
            index2 = 0;
            continue;
        }
        if (answer.indexOf(element) > -1) {
            continue;
        }
        answer.push(element);
    }
};

solution([2,1,3,4,1]);