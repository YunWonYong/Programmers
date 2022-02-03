function solution(arr1, arr2) {
    let answer=new Array(arr1.length);
    
    for(let i=0; i<arr1.length; i++ ){
        answer[i]=new Array(0);
        for(let j=0; j<arr2[0].length; j++){
            answer[i].push(arr1[i][j]+arr2[i][j]);
        }
    }
    
    return answer;
}