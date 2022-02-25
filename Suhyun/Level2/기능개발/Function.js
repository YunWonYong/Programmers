let progresses = [93, 30, 55];
let speeds = [1, 30, 5];

let day = [];

for (let i = 0; i < progresses.length; i++) {
    let count = 0;
    while (progresses[i] < 100) {
        progresses[i] += speeds[i];
        count++;
    }
    day[i] = count;
}

let answer = [];
let max = day[0];
let count = 0;

for (let i = 0; i < day.length; i++) {
    if (max < day[i]) {
        max = day[i];
        answer.push(count);
        count = 0;
    }

    if (i == day.length - 1 && count == 0) {
        answer.push(1);
        break;
    }
    count++;
    if (i == day.length - 1) {
        answer.push(count);
    }

}
return answer;