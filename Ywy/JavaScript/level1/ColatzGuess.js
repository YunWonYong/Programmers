export default class ColatzGuess {
    solution = (num) => {
        let count = 0;
        while (true) {
            if (num === 1) {
                return count;
            }
            count++;
            num = num % 2 === 0 ? Math.floor(num / 2) : num * 3 + 1;

            if (count === 500 || num < 1) {
                return -1;
            }
        }
    }

    solution2 = (num, count) => {
        count >>= 0;
        if (count === 500) {
            return -1;
        } else if (num === 1) {
            return count;
        }
        return this.solution2(num % 2 === 0 ? num / 2 : num * 3 + 1, ++count);
    }
}