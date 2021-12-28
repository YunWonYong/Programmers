function solution(s) {
    let answer =true;
    let reg =/^[0-9]*$/;
    
    // isNaN은 1e22도 false 반환 
    
    if(reg.test(s)==false)
    {
     return false;
    }
    else if(s.length==4 || s.length==6){
         return true;
    }
    else{
      return false;
    }
}