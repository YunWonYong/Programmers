//프로그래머스 Level 1,시저 암호
function solution(s, n) {
    return [...s].map( (d) => {
        let x = d.charCodeAt(0);
        if(x>=65 && x <=90) {
            x = (x-65+n)%26 + 65;
        } else if (x>=97 && x<=122) {
            x = (x-97+n)%26 + 97;            
        }                
        return String.fromCharCode(x);
    }).join("");
}