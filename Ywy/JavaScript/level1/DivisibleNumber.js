// const solution = (arr, divisor) => {
//     let answer = [];
//     let temp = 0;
//     arr.forEach( el => {
//         temp = el / divisor;
//         if (/^[1-9]{1}[0-9]*$/.test(temp) || /^[1-9]{1}[0-9]*[.]{1}[0]{1}$/.test(temp)) {
//             answer.push(el);
//         }
//     });
//     answer = answer.sort((prev, next) => prev - next);
//     return answer[0] === undefined ? [-1] : answer;
// };

const solution = (arr, divisor) => {
    const answer = [];
    arr.forEach( el => {
        if (el % divisor === 0) {
            answer.push(el);
        }
    });
    return answer[0] === undefined ? [-1] : answer.sort((prev, next) => prev - next);
};