// 짝지어 제거하기 (12973)
function solution(s) {
    let stack = [];
    for (let e of s) {
        let length = stack.length;
        if (length === 0) {
            stack.push(e);
            continue;
        }
        if (stack[stack.length-1] === e) {
            stack.pop();
        } else {
            stack.push(e);
        }
    }

    return stack.length === 0? 1 : 0;
}