const solution = (a, b) => a.map((el, index) => multiply(el, b[index])).reduce(sum);
const sum = (pre, next) => pre + next;
const multiply = (pre, next) => pre * next;