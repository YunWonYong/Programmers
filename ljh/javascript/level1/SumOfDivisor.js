// 약수의 합(220108 - 220114)
export default class SumOfDivisor{
    solution = (n) => {
        return (Array.from({length:n}, (x, i) => i+1))
            .filter(v => n%v == 0)
            .reduce((prev, curr) => prev + curr, 0);
    }
}