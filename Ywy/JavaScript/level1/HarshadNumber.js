export default class HarshadNumber {
    solution = (x) => !(x % Array.from(String(x).replace(/[^1-9]/g, ""), Number).reduce((pre, next) => pre + next, 0));
}