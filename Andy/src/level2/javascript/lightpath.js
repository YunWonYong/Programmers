//프로그래머스 Level 2,빛의 경로 사이클
function solution(grid) {
    var answer = [];
    
    const LEFT = 0;
    const RIGHT = 1;
    const UP = 2;
    const DOWN = 3;
        
    const arrowOutS = [ RIGHT,LEFT,DOWN,UP ];
    const arrowOutR = [ DOWN,UP,LEFT,RIGHT ];
    const arrowOutL = [ UP,DOWN,RIGHT,LEFT ];
    
    class Grid {
        constructor(type) { this.stype= type; }
        inArr = [ 0,0,0,0 ]; 
        outArr = [ 0,0,0,0 ];         
        getInput(arrow) {
            if(this.stype === "S") {
                return arrowOutS[arrow];
            }
            else if(this.stype === "R") {
                return arrowOutR[arrow];
            }
            else if(this.stype === "L") {
                return arrowOutL[arrow];
            }           
        }        
    }
    
    arr = [];
    grid.forEach( (d,i)=> {
        arr2 = [];
        [...d].forEach( (d2,i2) => {
            arr2[i2] = new Grid(d2);
        });
        arr[i] = arr2;
    });

    function trace(x,y,aw) {
        if(arr[x][y].inArr[aw] > 0) return -1;
        
        row = x; col = y; arrow = aw;
        cnt = 1;
        for(;;) {
            arrow = arr[row][col].getInput(arrow);
            arr[row][col].outArr[arrow] = cnt;
            cnt++;
            
            if(arrow == LEFT) col = col - 1;  if(col<0) col=arr[row].length-1;            
            if(arrow == RIGHT) col = (col + 1) % arr[row].length;
            if(arrow == UP) row--; if(row<0) row = arr.length-1;
            if(arrow == DOWN) row = (row + 1) % arr.length;
            
            arrow = (arrow+1)%2 + (arrow/2>>0)*2;
            
            if(arr[row][col].inArr[arrow] > 0) return -1;
            
            arr[row][col].inArr[arrow] = cnt;
                  
            if(row == x && col == y && aw == arrow) {                
                return cnt/2;
            }
            cnt++;
        }
       
    }
    
    // 모든 방향에서 빛을 쏜다.
    arr.forEach( (d,i) => {
        d.forEach( (d2,i2) => {      
            for(ar=LEFT;ar<=DOWN;ar++) {
                ret = trace(i,i2,ar);    
                if(ret>0) answer.push(ret);
            }
        });
    });
        
    return answer.sort((a,b)=>a-b);
}