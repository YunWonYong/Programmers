package level1.java;

//프로그래머스 Level 1,하샤드 수
public class harshad {
    public int digit_sum(int x) {
        if(x<1) return x;
        return x%10 + digit_sum(x/10);
    }
    
    public boolean solution(int x) {
        if(x%digit_sum(x) == 0) return true;
        return false;
    }
}
