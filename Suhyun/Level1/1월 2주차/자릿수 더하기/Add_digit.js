let n=123;
let str=String(n);
let answer=0;
let arr=str.split('');

arr.map(i => {
    answer=answer+parseInt(i)});

console.log(answer);


//프로그래머스용
function solution(n)
{
    let str=String(n);
    let answer=0;
    let arr=str.split('');

    arr.map(i => {
        answer=answer+parseInt(i)});

    return answer;

}