export default class TargetNumber {
    solution = (numbers, target) => {
        const range = numbers.length;
        const dfs = (depth, sum) => {
            if (depth === range) {
                return sum === target;
            }
            let el = numbers[depth];
            return dfs(++depth, sum + el) + dfs(depth, sum - el);
        };
        return dfs(0, 0);
    };
}