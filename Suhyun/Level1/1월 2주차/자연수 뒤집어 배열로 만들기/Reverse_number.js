let n=123456789;
let str=n.toString();
let ch=str.split('');

let answer=[];

for(let i=str.length; i>0 ; i--){
    let num=parseInt(ch[i-1]);
    answer.push(num);

    //answer.push(parseInt(ch[i-1]));


}
console.log(answer);

//프로그래머스용 
function solution(n) {
    let str=n.toString();
    let ch=str.split('');
    let answer=[];
        
    for(let i=str.length; i>0 ; i--){
        let num=parseInt(ch[i-1]);
        answer.push(num);
    
    }
        return answer;
    }

// 속도는 비슷하나 깔끔
return n.toString().split('').reverse().map(o => o = parseInt(o));