export default class RotateMatrixBorder {
    solution = (rows, columns, queries) => {
        const answer = [];
        const matrix = [];
        let index = 0;
        let index2 = 0;
        let el = 1;
        while (index++ < rows) {
            let vecter = [];
            while (index2++ < columns) {
                vecter.push(el++);
            }
            index2 = 0;
            el = index * columns + 1;
            matrix.push(vecter);
        }
        queries.forEach(querie => {
            let [row, col, rowMax, colMax] = querie;
            row--, col--, rowMax--, colMax--;
            let current = matrix[row][col];
            let next = 0;
            let min = current;
            while (true) {
                if (row < rowMax && col < colMax) {
                    next = matrix[row][++col];
                } else if (col == colMax && row < rowMax) {
                    next = matrix[++row][col];
                } else if (querie[1] - 1 < colMax) {
                    next = matrix[row][--colMax];
                    col--;
                } else if (querie[0] - 1 < rowMax) {
                    next = matrix[--rowMax][colMax];
                    row--;
                } else {
                    answer.push(min);
                    return;
                }
                matrix[row][col] = current;
                current = next;
                if (min > current) {
                    min = current;
                }
            }
        });
        return answer;
    };
}