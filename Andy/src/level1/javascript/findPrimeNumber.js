//프로그래머스 Level 1,소수 찾기
function solution(n) {
    let arr = [ ];    
    for(let i=2;i<=n;i++) {
        if(arr[i] == 0) continue;
        arr[i] = 1
        for(let j=2;i*j<=n;j++) {
            arr[i*j] = 0;            
        }
    }
    return arr.reduce( (a,d) => { return a+d; });
}