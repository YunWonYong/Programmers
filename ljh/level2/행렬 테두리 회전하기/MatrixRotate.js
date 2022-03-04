// 행렬 테두리 회전하기 (77485)

function solution(rows, columns, queries) {
    const matrix = Array.from(Array(columns), () => new Array(rows));
    let val = 1;
    for (let j = 0; j < rows; j++) {
        for (let i = 0; i < columns; i++) {
            matrix[i][j] = val++;
        }
    }

    const answer = [];
    for (let e of queries) {
        let min = move_min(matrix, e[1]-1, e[0]-1, e[3]-1, e[2]-1);
        answer.push(min);
    }

    return answer;
}

function move_min(matrix, x1, y1, x2, y2) {
    let min = matrix[x1][y1];
    let temp = 0;
    let previous = matrix[x1][y1];

    for (let i = x1; i <= x2; i++) {
        temp = matrix[i][y1];
        if (temp < min) {
            min = temp;
        }
        matrix[i][y1] = previous;
        previous = temp;
    }
    for (let j = y1+1; j <= y2; j++) {
        temp = matrix[x2][j];
        if (temp < min) {
            min = temp;
        }
        matrix[x2][j] = previous;
        previous = temp;
    }
    for (let i = x2-1; i >= x1; i--) {
        temp = matrix[i][y2];
        if (temp < min) {
            min = temp;
        }
        matrix[i][y2] = previous;
        previous = temp;
    }
    for (let j = y2-1; j >= y1; j--) {
        temp = matrix[x1][j];
        if (temp < min) {
            min = temp;
        }
        matrix[x1][j] = previous;
        previous = temp;
    }

    return min;
}