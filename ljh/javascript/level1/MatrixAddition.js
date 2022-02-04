// 행렬의 덧셈 (220129 - 220204)

// 방법1
function solution(arr1, arr2) {
    let col_len = arr1[0].length;
    let begin = 0;
    let end = col_len;
    let arr3 = []; // flat 배열 덧셈 결과
    let answer = [];

    arr1 = arr1.flat();
    arr2 = arr2.flat();

    let len = arr1.length;

    for(let i=0; i<len; i++){
        arr3[i] = arr1[i] + arr2[i];
    }
    
    while(end<=len){
        answer.push(arr3.slice(begin, end));
        begin += col_len;
        end += col_len;
    }

    return answer;
}

// 방법2
function solution2(arr1, arr2) {
    let row_len = arr1.length;
    let col_len = arr1[0].length;
    let answer = Array.from(Array(row_len), () => new Array(col_len));

    for(let i=0; i<row_len; i++){
        for(let j=0; j<col_len; j++){
            answer[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

    return answer;
}