export default class ParenthesesConversion {
    solution = (p) => {
        if (p.length === 2) {
            return "()";
        } else if (p.length === 0) {
            return "";
        }

        const answer = [];
        const obj = this.search([...p]);
        let str = obj.u.join("");
        p = p.replace(str, "");

        if (obj.isBalance) {
            answer.push(str);
            answer.push(this.solution(p));
        } else {
            str = str.substring(1, str.length - 1);
            answer.push("(");
            answer.push(this.solution(p));
            answer.push(")");
            if (str.length > 0) {
                answer.push(this.reversal([...str]));
            }
        }
        return answer.join("");
    };

    search = (parentheses) => {
        const result = {};
        result.u = [];
        let leftCount = 0;
        let rightCount = 0;
        let index = 0;
        let range = parentheses.length - 1;
        let current = undefined;
        let next = undefined;
        while (index < range) {
            current = parentheses[index++];
            next = parentheses[index++];
            if (current === "(") {
                leftCount++;
            } else if (current === ")") {
                rightCount++;
            }
            if (next === "(") {
                leftCount++;
            } else if (next === ")") {
                rightCount++;
            }
            result.u.push(current);
            result.u.push(next);
            if (leftCount === rightCount) {
                break;
            }
        }
        return this.balanceCheck(result);
    };

    balanceCheck = (result) => {
        let index = 0;
        let range = result.u.length;
        let stack = [result.u[index]];
        let next = undefined;
        let current = result.u[index];
        while (++index < range) {
            next = result.u[index];
            if (current === "(" && next === ")") {
                current = stack.pop();
                continue;
            }
            stack.push(next);
            current = next;
        }
        result.isBalance = stack.length === 0;
        return result;
    };

    reversal = (parentheses) => {
        let index = 0;
        let range = parentheses.length;
        let at = undefined;
        while (index < range) {
            at = parentheses[index];
            parentheses[index++] = at === "(" ? ")" : "(";
        }
        return parentheses.join("");
    };
}