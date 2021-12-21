function solution(arr)
{
    var answer = [];
    let curr = -1;
    
    arr.forEach((value) => {
        if(value !== curr){
            curr = value;
            answer.push(value);
        }
    })
    return answer;
}