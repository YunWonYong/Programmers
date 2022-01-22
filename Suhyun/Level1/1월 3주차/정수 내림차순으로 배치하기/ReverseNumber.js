let n=118372
//숫자 문자열 변경
// 쪼개고 내림차순 후 정렬 
// 형변환
let answer=parseInt(n.toString().split('').sort((a,b)=>b-a).join(''));
console.log(answer)