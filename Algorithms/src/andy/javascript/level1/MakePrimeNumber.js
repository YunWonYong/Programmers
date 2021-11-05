// 프로그래머스 Level 1,
// 소수만들기
function isPrime(num) {
    for(let i=2;i<num;i++)
        if(num%i == 0) return false;
    return true;
}

function solution(nums) {
    var answer = 0;
    
    let len = nums.length;
    for(let i=0;i<len;i++) {
        for(let j=i+1;j<len;j++) {
            for(let k=j+1;k<len;k++) {
                let num = nums[i] + nums[j] + nums[k];
                if(isPrime(num)) answer++;
            }
        }
    }
    
    return answer;
}