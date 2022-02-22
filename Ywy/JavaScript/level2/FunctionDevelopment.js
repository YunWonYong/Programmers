export default class FunctionDevelopment {
    solution = (progresses, speeds) => {
        const answer = [];
        const table = {};
        let count = 0;
        let max = 0;
        progresses.forEach((progress, index) => {
            let speed = speeds[index];
            let key = `${progress}_${speed}`;
            let day = table[key];
            if (!day) {
                day = this.getDay(progress, speed);
                if (max == 0) {
                    max = day;
                }
            }
            if (max < day) {
                answer.push(count);
                max = day;
                count = 0;
            }
            count++;
        });
        answer.push(count);
        return answer;
    };

    getDay = (progress, speed) => {
        let time = 0
        while(true) {
            time++;
            if (progress >= 100) {
                return time;
            }
            progress += speed;
        }
    };
}