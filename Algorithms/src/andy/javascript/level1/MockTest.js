// 프로그래머스 Level 1,모의고사
function solution(answers) {
    var answer = [];
    var arr= [[],[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]];
    var jumsu = [0,0,0,0];
    answers.forEach(function(i,idx) {
    	for(let j=1;j<=3;j++)
    		if(i==arr[j][idx%arr[j].length])
    			jumsu[j]++;
    });
    
    var m = Math.max(...jumsu);
    jumsu.forEach( function(i,idx) {
    	if(i==m) answer.push(idx);
    });

    return answer;
}