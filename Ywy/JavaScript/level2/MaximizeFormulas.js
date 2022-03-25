export default class MaximizeFormulas {
    solution = (expression) => {
        debugger;
        let answer = -1;
        const operators = [
            ["+", "-", "*"],
            ["+", "*", "-"],
            ["-", "+", "*"],
            ["-", "*", "+"],
            ["*", "+", "-"],
            ["*", "-", "+"],
        ];

        operators.forEach(opers => {
            let numbers = expression.replace(/[^0-9]/g, "#").split("#");
            let operss = expression.replace(/[0-9]/g, "").split("");
            opers.forEach( op => {
                if (opers.indexOf(op) === -1) {
                    return;
                }
                let index = 0;
                let range = operss.length;
                let o = 0;
                while(index < range) {
                    o = operss[index];
                    if (o === op) {
                        numbers[index] = eval(`${numbers[index]}${op}${numbers[index + 1]}`);
                        delete operss[index];
                        delete numbers[index + 1];
                        operss = operss.flat();
                        numbers = numbers.flat();
                        range--;
                        continue;
                    }
                    index++;
                }
            });

            let number = numbers[0];
            if (number < 0) {
                number = ~number  + 1;
            }
            if (answer < number) {
                answer = number;
            }
        });
        return answer;
    }
}