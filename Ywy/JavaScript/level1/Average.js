export default class Average {
    solution = (arr) => arr.reduce((pre, next) => pre + next, 0) / arr.length;
}