//프로그래머스 Level 2,문자열 압축
function solution(s) {
    var answer = s.length;
    let mid = parseInt(s.length/2);
    for(let i=1;i<=mid;i++) {
        let dup = 1;
        let one = "";
        let cnt = 0;
        for(let j=0;j<s.length;j++) {
            let two = s.substr(i*j,i);
            if(two.length < i) break;
            if(one.localeCompare(two) == 0) {
                dup++;
            }
            else {
                if(dup>1) {
                    cnt += (i*dup - (dup+one).length);
                }
                one = two;
                dup=1;
            }
        }
        
        if(dup>1) {
            cnt += (i*dup - (dup+one).length);
        }        
        answer = Math.min(answer,s.length-cnt);
    }

    return answer;
}