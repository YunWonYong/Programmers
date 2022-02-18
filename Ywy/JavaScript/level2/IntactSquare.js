export default class IntactSquare {
    solution = (w, h) => {
        return w * h - (w + h - this.gcd(w, h));
    };

    gcd = (n, m) => m === 0 ? n : this.gcd(m, n % m);
}