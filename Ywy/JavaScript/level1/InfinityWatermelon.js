export default class InfinityWatermelon {
    solution = (n) => {
        const str = "수박";
        let index = 0;
        let answer = [];
        do {
            answer.push(str.charAt(index % 2));
        } while(++index < n);
        return answer.join("");
    };
}
