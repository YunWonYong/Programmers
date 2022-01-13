export default class AddDigits {
    solution = (n) => Array.from(String(n), el => el >> 0)
                           .reduce((pre, next) => pre  + next);
} ;