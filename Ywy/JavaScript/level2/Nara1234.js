export default class Nara1234 {
    solution = (n) => {
        const answer = [];
        let digit = 0;
        while (n > 0) {
            digit = n % 3;
            if (digit === 0) {
                n--;
                digit = 4;
            }
            n = (n / 3) << 0;
            answer.unshift(digit);
        }
        return answer.join("");
    };
}