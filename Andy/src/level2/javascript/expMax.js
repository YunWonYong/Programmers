//프로그래머스 Level 2,수식 최대화
function solution(expression) {
    function getSum(exp_a,exp_b) {
        let arr = [];
        expression.split(exp_a).forEach( (d) => {
            let e = d.split(exp_b);
            let tmp = [];
            e.forEach( (d) => tmp.push(eval(d)) );
            arr.push(eval(tmp.join(exp_b)));
        });
        return Math.abs(eval(arr.join(exp_a)));
    }
    
    var answer = 0;
    const prior = [
        ['-', '*', '+'],
        ['-', '+', '*'],
        ['*', '-', '+'],
        ['*', '+', '-'],
        ['+', '-', '*'],
        ['+', '*', '-']
    ]
    
    prior.forEach( (d) => {
        answer = Math.max(answer,getSum(d[0],d[1]));
    });
    
    return answer;
}