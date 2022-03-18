export default class CheckDistance {
    solution = (places) => {
        const answer = [];
        places.forEach(place => {
            answer.push(this.roomSearch(place));
        });
        return answer;
    };

    roomSearch = (place) => {
        let rooms = undefined;
        let row = 0;
        let result = 1;
        const range = place.length;
        do {
            rooms = place[row];
            if (rooms.indexOf("P") === -1) {
                continue;
            }
            result = this.search(place, [...rooms], row);
            if (result == 0) {
                break;
            }
        } while (++row < range);
        return result;
    };

    search = (place, rooms, row) => {
        let range = rooms.length;
        let col = 0;
        let room = undefined;
        do {
            room = rooms[col];
            if (room === 'P' && this.move(place, rooms, row, col) === 0) {
                return 0;
            }
        } while (++col < range);
        return 1;
    };

    move = (place, rooms, row, col) => {
        const moves = [(place[row - 1] || [])[col], rooms[col + 1], (place[row + 1] || [])[col], rooms[col - 1]];
        let move = 0;
        let index = 0;
        let range = moves.length;
        let flag = false;
        do {
            move = moves[index];
            if (move === undefined) {
                continue;
            }
            if (move === 'P') {
                return 0;
            } else if (move === 'X') {
                continue;
            }
            switch (index) {
                case 0:
                    flag = (place[row - 1] || [])[col + 1] === 'P' || (place[row - 2] || [])[col] === 'P';
                    break;
                case 1:
                    flag = (place[row + 1] || [])[col + 1] === 'P' || rooms[col + 2] === 'P';
                    break;
                case 2:
                    flag = (place[row + 1] || [])[col - 1] === 'P' || (place[row + 2] || [])[col] === 'P';
                    break;
                case 3:
                    flag = (place[row - 1] || [])[col - 1] === 'P' || rooms[col - 2] === 'P';
                    break;
            }
            if (flag) {
                return 0;
            }
        } while (++index < range);
        return 1;
    };
}