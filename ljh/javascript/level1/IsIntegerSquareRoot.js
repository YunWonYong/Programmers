// 정수 제곱근 판별 (220115 - 220121)
export default class IsIntegerSquareRoot {
    solution = (n) => {
        let x = Math.sqrt(n);
        return x % 1 == 0? (x+1)**2 : -1;
    }
}