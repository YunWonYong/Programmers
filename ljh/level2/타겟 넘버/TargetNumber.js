// 타겟 넘버 (43165)
function solution(numbers, target) {
    return dfs(numbers, target, 0, 0);
}

function dfs(numbers, target, n, sum) {
    if (numbers.length == n) {
        if (target == sum) {
            return 1;
        }    
        return 0;
    }
    
    return dfs(numbers, target, n + 1, sum + numbers[n]) + dfs(numbers, target, n + 1, sum - numbers[n]);
}