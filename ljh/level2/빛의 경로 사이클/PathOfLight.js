// 빛의 경로 사이클

function solution(grid) {
    const path = [];
    const x = [0, 1, 0, -1];
    const y = [-1, 0, 1, 0];
    let r;
    let c;
    let d;
    const prev = [2, 3, 0, 1]; // 대칭
    const next = new Map();
    next.set('S', 2);
    next.set('L', 1);
    next.set('R', 3);
    
    let count = 0;
    const answer = [];

    for (let i = 0; i < grid.length; i++) {
        path [i] = new Array(grid[i].length);
        for (let j = 0; j < grid[i].length; j++) {
            path[i][j] = new Array(4).fill(false);
        }
    }
    
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            for (let k = 0; k < 4; k++) {
                r = i;
                c = j;
                d = k;
                while (path[r][c][d] === false) {
                    path[r][c][d] = true;
                    r += y[d];
                    c += x[d];
                    if (r === grid.length) 
                        r = 0;
                    if (r < 0) 
                        r = grid.length - 1;
                    if (c === grid[i].length)
                        c = 0;
                    if (c < 0) 
                        c = grid[i].length - 1;
                    d = (next.get(grid[r][c]) + prev[d]) % 4;
                    count++;
                }
                if (count > 0) {
                    answer.push(count);
                    count = 0;
                }
            }
        }
    }
    
    return answer.sort((a,b) => a - b);
}