export default class MaximizeFormulas {
    solution = (expression) => {
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
            let numbers = expression.split(/[^0-9]/g);
            let operss = expression.replace(/[0-9]/g, "").split("");
            opers.forEach( op => {
                let index = 0;
                let range = operss.length;
                let o = 0;
                while(index < range) {
                    o = operss[index];
                    if (o === op) {
                        numbers[index] = eval(`${numbers[index]} ${o} ${numbers[index + 1]}`);
                        operss.splice(index, 1);
                        numbers.splice(index + 1, 1);
                        continue;
                    }
                    index++;
                }
            });
            
            let number = Math.abs(numbers[0]);
            if (answer < number) {
                answer = number;
            }
        });
        return answer;
    }
}