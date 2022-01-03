package level1.java;

//프로그래머스 Level 1,수박수박수박수박수박수?
public class subak {
    public String solution(int n) {
        StringBuffer str = new StringBuffer(n);
        for(int i=0;i<n;i++) 
            str.append(i%2==0 ? "수" : "박");
        return str.toString();
    }
}
