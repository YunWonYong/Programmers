package level2.java;

//프로그래머스 Level 2,괄호 변환
public class parenthesesConvert {
    public static boolean perfect(String str) {
        if(str.length()<1) return true;
        int left = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '(') left++;
            else {
                left--;
                if(left<0) return false;
            }
        }
        return true;
    }
    
    public static int getMid(String str) {
        int left=0,right=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '(') left++;
            else right++;
            if(left == right) return i;
        }
        return 0;
    }
    
    public static String reverse(String str) {
        str = str.substring(1,str.length()-1);
        String buf = "";
        if(str.length()<1) return str;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '(') buf += ')';
            else buf += '(';
        }
        return buf;
    }
    
    public static String rec(String x) {
        if(x.length()<1 || perfect(x) == true) return x;
        
        String u,v;
        int mid = getMid(x);
        u = x.substring(0,mid+1);
        v = x.substring(mid+1);
        
        System.out.println(u +":"+v);
        
        if(perfect(u) == true)
            return u + rec(v);
        else   
            return "(" + rec(v) + ")" + reverse(u);
             
    }
    
    public String solution(String p) {
        String answer = "";
        
        answer = rec(p);
        
        return answer;
    }
}
