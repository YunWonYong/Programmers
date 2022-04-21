// 수식 최대화
function solution(expression) {
    const numbers = expression.split(/[\+\-\*]/g).map(val => parseInt(val));
    const operators = expression.match(/[\+\-\*]/g);
    const signs = ['+', '-', '*'];
    const answers = [];
    
    perm(signs, 0, 3, 3);
    
    function perm (arr, depth, n, k) {
        if (depth === k) {
            process(numbers, operators, arr, 0);
            return;
        }
        
        for (let i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k);
            swap(arr, i, depth);
        }
    }
    
    function process(numbers, operators, arr, pointer) {
        if (pointer === arr.length) {
            answers.push(numbers[0]);
            return;
        }
        
        const nums = [];
        const oper = [];
        let index = 0;
        const priority = arr[pointer];
        
        nums.push(numbers[0]);
        while (index < operators.length) {
            let result;
            if (operators[index++] === priority) {
                result = cal(nums.pop(), numbers[index], priority); 
            } else {
                result = numbers[index];
                oper.push(operators[index-1]);
            }
            nums.push(result);
        }
        process(nums, oper, arr, pointer + 1);
    }

    return Math.max(...answers.map(value => Math.abs(value)));    
}

function swap(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

function cal(a, b, sign) {
    if (sign === '+')
        return a + b;
    if (sign === '-')
        return a - b;
    if (sign === '*')
        return a * b;
}

