export default class SumOfFactors {
    solution = n => {
        let answer = 0;
        let num = 1;
        const range = n / 2;
        while(true) {
            if (num > range) {
                return answer + n;
            }
            if (n % num === 0) {
                answer += num;
            }
            num++;
        }
    }
};