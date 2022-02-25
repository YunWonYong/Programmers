export default class PairRemove {
    solution = (s) => {
        let index = 0;
        const range = s.length;
        const stack = [];

        do {
            if (stack[stack.length - 1] === s[index]) {
                stack.pop();
                continue;
            }
            stack[stack.length] = s[index];
        } while (++index < range);
        return stack.length === 0 ? 1 : 0;
    };
}