// 프로그래머스 Level 2 ,n^2 배열 자르기
function solution(n, left, right) {
    var answer = [];
    var arr = [];
    var idx = 0;
    let x = parseInt(left/n)+1;
    idx = n * (x-1);
    
    for(;x<=n;x++) {
        if(idx>right) break;
        if(idx+n < left) {
            idx += n;
            continue;
        }

        for(let y=1;y<=n;y++) {
            let d = y<=x?x:y;            
            if(idx>=left && idx<=right) answer.push(d);
            idx++;
        }
    }
    return answer;
}