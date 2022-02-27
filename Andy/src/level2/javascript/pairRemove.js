//프로그래머스 Level 2,짝지어 제거하기
function solution(s)
{
    function checkLast(arr,d) {
        if(arr.length == 0) return false;
        if(arr[arr.length-1].localeCompare(d) == 0) return true;
        return false;
    }
    
    var arr = [];    
    [...s].forEach( (d) => {
        if(checkLast(arr,d)) 
            arr.pop();
        else 
            arr.push(d);    
    });
    
    if(arr.length == 0) return 1;
    return 0;
}