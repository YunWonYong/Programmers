//프로그래머스 Level 2,오픈채팅방
function solution(record) {
    const ENTER = 1;
    const LEAVE = 2;
    const ENTER_STR = "님이 들어왔습니다.";
    const LEAVE_STR = "님이 나갔습니다.";
    
    var answer = [];
    var ulist = [];
    var chat = [];
    let cmd,uid,name;
    record.forEach( (d) => {
        [cmd,uid,name] = d.split(" ");
        if(cmd.localeCompare("Enter") == 0) {
            ulist[uid] = name;
            chat.push([uid,ENTER]);
        } 
        else if(cmd.localeCompare("Leave") == 0) {
            chat.push([uid,LEAVE]);
        }
        else {
            ulist[uid] = name;
        }
    });
    
    chat.forEach( (d) => {
        answer.push(ulist[d[0]] + (d[1]==ENTER?ENTER_STR:LEAVE_STR));
    });
    
    return answer;
}