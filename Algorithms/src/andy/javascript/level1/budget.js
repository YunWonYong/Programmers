//프로그래머스 Level 1, 예산
function solution(numbers) {
    var answer = [];
    var set = new Set();
    for(let i=0;i<numbers.length;i++) {
        for(let j=i+1;j<numbers.length;j++)
            set.add(numbers[i]+numbers[j]);
    }
    return [...set].sort((a,b)=>{return a-b;});
}