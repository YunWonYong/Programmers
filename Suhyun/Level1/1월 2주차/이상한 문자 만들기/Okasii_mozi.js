let s="try     hello world";

let answer=s.split(' ').
    map( tan => tan.split('').
        map( (ch,i) => i%2==0 ? ch.toUpperCase() : ch.toLowerCase()
    ).join('')
).join(' ');

console.log(answer);


// //프로그래머스용
// function solution(s) {
//     let answer=s.split(' ').
//         map( tan => tan.split('').
//             map( (ch,i) => i%2==0 ? ch.toUpperCase() : ch.toLowerCase()
//         ).join('')
//     ).join(' ');
        
//         return answer;
//     }

