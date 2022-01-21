export default class NumberDescSort {
    solution = (n) => {
        return +Array.from(String(n), Number).sort((prev, next) => prev < next ? 1 : -1).join("");
    };
}