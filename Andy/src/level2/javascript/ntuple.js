//프로그래머스 Level 2,튜플
function solution(s) {
    var answer = [];
    s = s.substring(2,s.length-2).split("},{");
    s.push("");
    s.sort((a,b) => a.length-b.length).reduce( (a,b) => {
        answer.push(b.split(",").map(Number).reduce( (a,d) => a+d) - a.split(",").map(Number).reduce( (a,d) => a+d));
        return b;
    });
    return answer;
}