// 튜플
function solution(s) {
    const slice = [];
    const length = s.length - 1;
    let begin = 0;
    let end;
    while (begin !== length) {
        end = s.indexOf('}', begin);
        slice.push(s.substring(begin + 2 , end));
        begin = end + 1;
    }
    
    let arrSet = [];
    slice.forEach((value) => arrSet.push(value.split(',')));
    arrSet.sort((a, b) => a.length - b.length);
    
    let answer = [];
    for (let i = 0; i <arrSet.length; i++) {
        arrSet[i].forEach((value) => {
            value = parseInt(value);
            if(!answer.includes(value))
                answer.push(value);
        });
    }

    return answer;
}