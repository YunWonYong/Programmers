function solution(n) {
    //0.28s
    let n=3;
    let answer="";

    for(let i=0; i<n; i++){
        answer+= i%2==0 ? '수' : '박';
    }
}
console.log(answer);

//0.05s
function solution(n) {
    return '¼ö¹Ú'.repeat(n/2) + (n%2 === 1 ? '¼ö' : '');
   
}
