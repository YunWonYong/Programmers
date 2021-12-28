function solution(n) {
    let answer = 0;
    let arr=[];
    // n까지 소수 구할 때 제곱근 n 이하 수 배수만 지우면 오케이 
    arr[0]=arr[1]=0;
    for(let i=2 ; i<=n ; i++){
        arr[i]=i;
    }

    for(let i=2 ; i<=Math.sqrt(n);i++ ){
        if(arr[i]==0){
            continue;
        }
        for( let j=i+i ; j<=n ; j+=i){
            arr[j]=0;
        }

    }

    for(let i=0 ; i<arr.length ; i++){
        if(arr[i]!=0){
            answer++;
        }
    }



    return answer;
}