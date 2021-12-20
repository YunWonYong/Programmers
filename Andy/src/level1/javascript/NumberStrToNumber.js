// 숫자 문자열과 영단어
function solution(s) {
    var answer = 0;
    var arr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    arr.forEach( function(d,i) { s = s.replace(new RegExp(d,"gi"),""+i); });
    return parseInt(s);
}