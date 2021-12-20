const solution = (a, b) => {
    let flag = a < b;
    let answer = flag ? a : b;
    while(flag ? a < b : b < a) {
        answer += flag ? ++a : ++b;
    }
    return answer;
};