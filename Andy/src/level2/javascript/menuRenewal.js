//프로그래머스 Level 2,메뉴 리뉴얼
function rec(menu, arr,idx,result,sz) {
    if(result.length==sz) { 
        result = [...result].sort().join("");
        if(menu[result]) 
            menu[result]++;
        else
            menu[result] = 1;
        return; 
    }
    if(idx>=arr.length) { return; }
    
    rec(menu,arr,idx+1,result,sz);
    rec(menu,arr,idx+1,result+arr[idx],sz);
}


function solution(orders, course) {
    var answer = [];    
    
    course.forEach( (cnt) => {
        let menufin = [];
        let menu = [];
        orders.forEach( (d) => {            
            rec(menu,[...d],0,"",cnt );

        });

        let mx = 2;
        for(let k in menu) {
            if(menu[k] == mx) { 
                menufin.push(k);
            }
            else if(menu[k]>mx) { 
                mx = menu[k];
                menufin = [ k ]
            }
        } 
        
        answer = answer.concat(menufin);
    });
    
    return answer.sort();
}