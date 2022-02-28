//프로그래머스 Level 2,타겟 넘버
function solution(numbers, target) {
    var answer = 0;
    
    function recursive(idx) {
        if(idx >= numbers.length) {
            if( target == numbers.reduce((a,d) => a+d)) answer++;
            return;
        }
        recursive(idx+1);
        numbers[idx] *= -1;
        recursive(idx+1);        
    }
    
    recursive(0);    
    return answer;
}