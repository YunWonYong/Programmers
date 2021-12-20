// 프로그래머스 Level 1,폰켓몬
function solution(nums) {
    var answer = 0;
    var cnt = parseInt(nums.length/2);
    var set = new Set(nums);
    if(cnt<set.size) answer=cnt;
    else answer = set.size;
    return answer;
}