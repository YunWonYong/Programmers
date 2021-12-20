// 프로그래머스 Level 1,실패율
function solution(N, stages) {
    var answer = [];   
    var cnt = stages.length;
    var arr = Array.from({length:N+2},() =>0);
    stages.forEach( (d) => { arr[d]++; });    
    var fail = [];
    for(let i=1;i<=N;i++) {
        fail[i] = { 'no':i, 'f':arr[i]/cnt };
        cnt -= arr[i];
    }    
    fail.sort( (a,b) => { return b.f-a.f }).forEach( (d) => { answer.push(d.no) });  
    return answer;
}
