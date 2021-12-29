function solution(n) {
    let answer = 0;
    let arr = [];
    
    arr[0] = arr[1] = 0;
    for(let i = 2 ; i <= n ; i++){
        arr[i] = i;
    }

    for(let i = 2 ; i <= Math.sqrt(n); i++ ){
        if(arr[i] == 0){
            continue;
        }
        for( let j = i+i ; j <= n ; j += i){
            arr[j] = 0;
        }

    }
    
    for(let i = 0 ; i < arr.length ; i++){
        if(arr[i] != 0){
            answer++;
        }
    }
    return answer;
}