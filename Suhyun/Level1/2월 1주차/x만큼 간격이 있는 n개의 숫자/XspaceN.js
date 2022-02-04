function solution(x, n) {
    let answer = Array(n);
    answer=answer.fill(1,0,n);
    
    answer=answer.map((v,i)=> v=(i+1)*x);    

    return answer;
}