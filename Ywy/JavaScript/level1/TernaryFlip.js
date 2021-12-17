const solution = (n) => {
    const ternarys = [n % 3];
    let quotient = 0;
    let answer = 0;
    let digit = 0;
    while(true) { 
         if (n < 3) {
            digit = ternarys.length;
            answer = ternarys.pop();
            break;
        }  
        quotient = n / 3;
        n = quotient;
        quotient = Math.floor(quotient % 3);
        ternarys.push(quotient);
    }
    
    while((quotient = ternarys.shift()) !== undefined) {
        digit--;
        if (quotient === 0) {
            continue;
        }
        answer += (quotient * (3 ** digit));
    }
    return answer;
};
