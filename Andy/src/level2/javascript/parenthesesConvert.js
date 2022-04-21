//프로그래머스 Level 2,괄호 변환
function solution(p) {
    var answer = '';
    
    function perfect(p) {
        if(p.length==0) return true;
        let arr = [...p];
        let st = [];
        for(let i=0;i<arr.length;i++) {
            if(arr[i] == ")") {
                if(st.length == 0) return false;
                st.pop();
            }
            else 
                st.push(arr[i]);
        }
        return st.length == 0?true:false;
    }
    
    function divide_uv(p) {
        let arr = [...p];
        let left=0,right=0;
        for(let i=0;i<arr.length;i++) {
            if(arr[i] =="(") left++;
            else right++;
            if(left == right) {
                return [ p.substr(0,i+1),p.substr(i+1) ];
            }
        }
        return [p,""];
    }
    
    function changestr(str) {
        let tmp = str.substr(1,str.length-2);          
        return [...tmp].map( (d) => d=="("?")":"(" ).join(""); 
    }
    
    function rec(x) {
        if(x.length<1 || perfect(x)) return x;
        
        let u,v;
        [u,v] = divide_uv(x);

        if(perfect(u)) {
            return u + rec(v);          
        }
        return "(" + rec(v) + ")" + changestr(u);
    }  
    answer = rec(p);
    
    return answer;
}