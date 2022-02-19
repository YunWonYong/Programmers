function solution(n) {
    let str = '';
    let temp;
    let borrow = false;
    while (n > 0) {
        temp = n % 3;
        n = Math.floor(n / 3); 

        if (borrow) {
            temp = temp - 1;
            if (temp < 0) {
                str = 2 + str;
                continue;
            }
        }

        if (temp === 0) {
            if (n === 0) break;
            str = 4 + str;
            borrow = true;
        } else {
            str = temp + str;
            borrow = false;
        }
        
    }
    
    return str;
}