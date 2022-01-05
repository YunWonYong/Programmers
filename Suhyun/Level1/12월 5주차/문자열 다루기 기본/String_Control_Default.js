function solution(s) {
    let answer = true;
    let reg = /^[0-9]*$/;
         
    if(reg.test(s) == true && (s.length == 4 || s.length == 6))
    {
         return true;
    }
    else{
      return false;
    }
}