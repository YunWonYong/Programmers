// 신규 아이디 추천
function solution(new_id) {
    var answer = '';
    new_id = new_id.toLowerCase();
    let str = "";
    [...new_id].forEach( (d) => {
    	if( (d >='a' && d<='z') || (d >='0' && d<='9') || d == "-" || d == "_" || d == ".") {
    		str += d;
    	}
    });
    str = str.replace(/\.{1,}/gi,".");
    if(str.charAt(0) == ".") str = str.substr(1);
    if(str.charAt(str.length-1) == ".") str = str.substr(0,str.length-1);
    if(str.length == 0) str = "a";
    if(str.length>15) str = str.substr(0,15);
    if(str.charAt(str.length-1) == ".") str = str.substr(0,str.length-1);
    if(str.length<=2) str = str + str.charAt(str.length-1).repeat(3-str.length);
    answer = str;
    return answer;
}