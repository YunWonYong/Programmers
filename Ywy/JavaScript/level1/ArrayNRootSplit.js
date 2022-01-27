export default class ArrayNRootSplit {
    solution = (n, left, right) => {
        let row = Math.floor(left / n);
        let col = left % n;
        let temp = 0;
        let index = 0;
        const answer = [];
        while (++row <= n) {
            do {
                temp = col + 1;
                if (row > temp) {
                    temp = row;
                }
                answer.push(temp);
                if (answer.length - 1 === (right - left)) {
                    return answer;
                }
            } while (++col < n);
            col = 0;
        }
    }
}    