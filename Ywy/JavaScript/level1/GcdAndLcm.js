export default class GcdAndLcm {
    solution = (n, m) => {
        let gcd = this.gcdFn(n, m);
        return [gcd, n * (m / gcd)];
    };

    gcdFn = (n, m) => {
        let temp = n;
        while (true) {
            if (m == 0) {
                return n;
            }
            temp = n % m;
            n = m;
            m = temp;
        }
    };
}
