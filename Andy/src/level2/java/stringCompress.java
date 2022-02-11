package level2.java;

//프로그래머스 Level 2,문자열 압축
public class stringCompress {
    public int solution(String s) {
        int answer = s.length();
        int mid = s.length()/2;
        
        for(int i=1;i<=mid;i++) {
        	int dup=1;
        	String one = "",two;
        	int cnt = 0;
        	
        	for(int j=0;j<s.length();j++) {
        		two = s.substring(i*j,Math.min(i*j+i, s.length()));
        		if(two.length()<i) break;
        		if(one.compareTo(two)==0) dup++;
        		else {
        			if(dup>1) {
        				cnt += (i*dup - (one+dup).length());
        			}
        			one = two;
        			dup = 1;
        		}
        	}
        	
        	if(dup>1) {
        		cnt += (i*dup - (one+dup).length());
        	}
        	answer = Math.min(answer, s.length()-cnt);
        }
        
        return answer;
    }
}
