//프로그래머스 Level 2,행렬 테두리 회전하기
function solution(rows, columns, queries) {
    var answer = [];
    
    // array생성 
    arr = [];
    idx = 1;
    for(i=1;i<=rows;i++) {
        arr[i] = [];
        for(j=1;j<=columns;j++) arr[i][j] = idx++;
    }
    
    queries.forEach( (d) => {
        row1 = d[0];
        col1 = d[1];
        row2 = d[2];
        col2 = d[3];
        
        // left
        arr2 = [];
        for(i=col1;i<=col2;i++) 
            arr2.push(arr[row1][i]);
        // down
        for(i=row1+1;i<=row2-1;i++) 
            arr2.push(arr[i][col2]);
        // right
        for(i=col2;i>=col1;i--)
            arr2.push(arr[row2][i]);        
        // up
        for(i=row2-1;i>=row1+1;i--) 
            arr2.push(arr[i][col1]);
        
        answer.push(Math.min(...arr2));

        for(i=row1;i<=row2;i++) 
            arr[i][col1] = arr2.pop();
        for(i=col1+1;i<=col2-1;i++)
            arr[row2][i] = arr2.pop();
        for(i=row2;i>=row1;i--) 
            arr[i][col2] = arr2.pop();        
        for(i=col2-1;i>=col1+1;i--) 
            arr[row1][i] = arr2.pop();
    });

    
    return answer;
}