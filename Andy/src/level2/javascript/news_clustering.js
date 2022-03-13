//프로그래머스 Level 2,[1차] 뉴스 클러스터링

function isAlphabet(str) {
    let a = str.charCodeAt(0);
    if(a>=65 && a<=90) return true;
    return false;
}


function stringSplit(str) {
    let arr = [];
    [...str.toUpperCase()].reduce( function(a,d) {
        if(isAlphabet(a) == true && isAlphabet(d) == true)
            arr.push(a+d);
        return d;
    });
    return arr.sort();
}

function solution(str1, str2) {
    var answer = 0;
    var arr1 = stringSplit(str1);
    var arr2 = stringSplit(str2);
    
    var arrBig = [];
    var arrSmall = [];
    
    let idx = 0;
    arr1.forEach( (d) => {
        if(arr2[idx] == undefined) {
            arrBig.push(d);
            return;
        }
        if(d < arr2[idx]) {
            arrBig.push(d);
            return;
        }        
        
        while(d>arr2[idx]) {
            arrBig.push(arr2[idx]);
            idx++;
        }
        if(d == arr2[idx]) {
            arrBig.push(d);
            arrSmall.push(d);
            idx++;
            return;
        }        
        arrBig.push(d);
    });
    
    for(let i=idx;i<arr2.length;i++) arrBig.push(arr2[i]);
    
    if(arrSmall.length==0 && arrBig.length==0) 
        answer = 1;
    else 
        answer = arrSmall.length/arrBig.length;
    
    return Math.floor(answer*65536);
}