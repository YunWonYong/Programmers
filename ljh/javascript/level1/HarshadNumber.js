// 하샤드 수 (220122-220128)
export default class HarshadNumber {
    solution = (n) => {
        return n % [...n+""].reduce((a,b) => a+ parseInt(b), 0) === 0;
    }
}
