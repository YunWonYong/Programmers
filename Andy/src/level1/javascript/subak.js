//프로그래머스 Level 1,수박수박수박수박수박수?
function solution(n) {
    var answer = '';
    var pa = cycle("수박");
    for(var i=0;i<n;i++) answer += pa.next().value;
    return answer;
}

function* cycle(xs) {
    while(true)
        for(let x of xs) 
            yield x;
}