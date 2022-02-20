function solution(n) {

    let answer = "";
    while (n > 0) {
        let remainder = n % 3;

        if (remainder == 0) {
            answer += 4;
        } else if (remainder == 1) {
            answer += 1;
        } else {
            answer += 2;
        }

        if (remainder == 0) {
            n = n - 1;
        }

        n /= 3;
        n = Math.floor(n);
    }

    answer = answer.split("").reverse().join("");
    return answer;
}