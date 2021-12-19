// 프로그래머스 Level 1,
// 완주하지 못한 선수
function solution(participant, completion) {
    var answer = '';
    var arr = participant.concat(completion);
    arr.sort();
    var cnt = 0;
    var str = "";
    arr.some(function(item) { 
        answer = item;
        if(str == item) cnt++;
        else {
            if(cnt%2) { answer = str;  return true; }
            str = item;
            cnt = 1;
        }

    });  
    return answer;
}