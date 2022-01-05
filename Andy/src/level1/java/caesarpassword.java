package level1.java;

//프로그래머스 Level 1,시저 암호
public class caesarpassword {
    public String solution(String s, int n) {
        int base = 65;
        StringBuffer str = new StringBuffer(n);
        for(int i=0;i<s.length();i++) {
            int x = (int)s.charAt(i);
            if(x == 32) {
                str.append(' ');
            }
            else {
                base = x<=90?65:97;
                str.append(Character.toString(base + (x+n-base)%26));
            }
        }
        return str.toString();
    }
}
