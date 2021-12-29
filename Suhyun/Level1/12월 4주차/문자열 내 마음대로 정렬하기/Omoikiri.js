function solution(strings, n) {
    
    let answer=[];
    for(let i = 0 ; i<strings.length ; i++)
    {
        answer.push(strings[i].charAt(n)+strings[i]);
    }
    answer.sort();
    
    for(let i = 0 ; i<strings.length ; i++)
    {
        answer[i]=answer[i].substr(1,answer[i].length)
    }
    
    
    return answer;
}
