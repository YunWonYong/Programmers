export default class ArrayByFlippingNumbers {
    solution = n => {
        const answer = [];
        Array.from(String(n)).forEach(el => answer.unshift(el >> 0));
        return answer;
    };
} 