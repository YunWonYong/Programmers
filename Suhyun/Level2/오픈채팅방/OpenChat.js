let record=["Enter uid1234 Muzi", "Enter uid4567 Prodo",
            "Leave uid1234","Enter uid1234 Prodo",
            "Change uid4567 Ryan","Enter usdf12 Magi", "Leave uid1234"];

let answer = [];
let map = new Map();

let nickname=[];
let sentence=[];

for(let i=0 ; i<record.length; i++){
    record[i]=record[i].split(" ");
    let id=record[i][1];
    nickname=record[i][2];
    if(nickname){
        map.set(id,nickname);
    }
    
}

for(let i=0; i<record.length; i++){
    sentence=record[i][0];
    let id=record[i][1];
    if(sentence=="Enter"){
        answer.push(map.get(id)+"님이 들어왔습니다.");
    }
    else if(sentence=="Leave"){
        answer.push(map.get(id)+"님이 나갔습니다.");
    }
}

return answer;




// id 처리만 다하고 record 앞단어로 처리 





console.log(record);