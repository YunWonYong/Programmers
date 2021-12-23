export default class AddMissingNumber {
    solution = (arr, n) => arr.sort().sort((prev, next) => prev.charAt(n) < next.charAt(n) ? -1 : 1);
}