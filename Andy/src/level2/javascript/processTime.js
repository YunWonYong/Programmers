//프로그래머스 Level 2,기능개발
function solution(progresses, speeds) {
    var answer = [];
    var fin = [];
    progresses.forEach( (d,i) => {
        fin.push(Math.ceil((100-d)/speeds[i]));
    });

    var build_time = 0;
    var cnt = 0;
    fin.forEach( (d,i) => {
        if(build_time >= d) cnt++;
        else {
            if(cnt>0) answer.push(cnt);
            cnt = 1;
            build_time = d;
        }
    });    
    answer.push(cnt);
    
    return answer;
}