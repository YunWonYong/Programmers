// 자릿수의 합(220108 - 220114)
export default class SumOfDigit {
    solution = (n) => {
        return [...n+""].reduce((prev, curr) => prev + +curr, 0);
    }
}