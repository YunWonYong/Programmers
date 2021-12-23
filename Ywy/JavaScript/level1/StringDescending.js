export default class StringDescending {
    solution = (s) => [...s.split("").sort(this.descOrder)].join("");
    descOrder = (prev, next) => prev < next ? 1 : -1;
}

