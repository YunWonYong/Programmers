export default class AddMissingNumber {
    solution = numbers => Math.abs(numbers.reduce(((pre, next) => pre + next), -45));
} 