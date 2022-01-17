//프로그래머스 Level 1,자릿수 더하기 
function solution(n) {
	return [...(""+n)].map(Number).reduce( (a,d) => a+d);
}