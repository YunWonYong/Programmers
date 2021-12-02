const solution = (price, money, count) => {
    let answer = 0;
    while(count > 0) {
        answer += (price * count--)
    }
    answer -= money;
    return answer <= 0 ? 0: answer;
};