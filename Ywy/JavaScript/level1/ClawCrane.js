const solution = (board, moves) => {
    const stack = [];
    let top = 0;
    let item = -1;
    let answer = 0;

    moves.forEach( col => {
        col--;
        item = boardSearch(board, col);
        if (item > 0) {
            if (next > 0 && item === stack[top - 1]) {
                    stack[--top] = 0;
                    answer += 2;
                    return;
            }    
            stack[top++] = item;
        }
    });
    return answer;
};

const boardSearch = (board, col) => {
    let index = 0;
    let range = board.length;
    let item = 0;
    do {
        item = board[index][col];
        if (item > 0) {
            board[index][col] = 0;
            return item;
        }
    } while((++index) < range);
    return item;
};