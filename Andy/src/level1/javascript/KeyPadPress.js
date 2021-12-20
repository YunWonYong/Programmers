//키패드 누르기
// 좌표 : [ 행,열 ]
function solution(numbers, hand) {
    const Left = "L";
    const Right = "R";
    var answer = '';

    var finger=[];
    finger[Left] = [ 3, 0 ];
    finger[Right] = [ 3,2 ];
    finger.cal = function(arrow,loc) { 
        return Math.abs(loc[0]-this[arrow][0]) + Math.abs(loc[1]-this[arrow][1]);
    } 
  
    numbers.forEach( function(d) { 
        let ans = Left;    
        var loc = [ parseInt(d==0?3:(d-1)/3) , parseInt(d==0?1:(d-1)%3) ];
        
        if(loc[1] == 0) 
            ans = Left;
        else if(loc[1] == 2) 
            ans = Right;           
        else {
            let left_len = finger.cal(Left,loc);
            let right_len = finger.cal(Right,loc);
            if(left_len<right_len) 
                ans = Left;
            else if(left_len>right_len) 
                ans = Right;
            else 
                ans = hand=="right"?Right:Left;
        }
         
        answer += ans;
        finger[ans] = loc;
    });
    
    return answer;
}