
// 오픈 채팅방(220205-220211)

function solution(record) {
    const id_map = new Map();
    const result = [];

    for(let m of record) {
        let message = m.split(' ');

        if(message[0] !== 'Leave') {
            id_map.set(message[1], message[2]);
        }
    }

    for(let m of record) {
        let message = m.split(' ');

        switch(message[0]) {
            case 'Enter':
                result.push(id_map.get(message[1]) + '님이 들어왔습니다.');
                break;
            case 'Leave':
                result.push(id_map.get(message[1]) + '님이 나갔습니다.');
                break;
        }
    }

    return result;
}