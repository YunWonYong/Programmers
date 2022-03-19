//프로그래머스 Level 2,거리두기 확인하기

function isSafe(arr) {
    function isCheck(row,col) {
        function rec(x,y,cnt) {            
            if(cnt>2 || x<0 || y<0 || x>=5 || y>=5) return;
            if(map[x][y] == "X") return;
            if(tmp[x][y] > cnt) {
                tmp[x][y] = cnt;
                if(map[x][y] == "P" && cnt != 0) {
                    ret = true;
                    return;
                }
                rec(x,y+1,cnt+1); 
                rec(x,y-1,cnt+1);
                rec(x+1,y,cnt+1);
                rec(x-1,y,cnt+1);                
            }
        }
                
        let ret = false;
        let tmp=Array.from(Array(5), ()=>Array(5).fill(5));
        rec(row,col,0);
        return ret;
    }
    
    let map = [];
    arr.forEach( (d) => {
        map.push( [...d]);
    });    
    
    let b = false;
    map.some( (d,i) => {
        d.some( (d2,i2) => {
            if(d2 == 'P' && isCheck(i,i2) == true) {
                b = true;
                return true;
            }
        });
        if(b == true) return true;
    });
    return b;
}

function solution(places) {
    var answer = [];
    
    places.forEach( (d) => {
       answer.push(isSafe(d) == false?1:0)
    });
    return answer;
}