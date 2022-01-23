package level1.java;

//프로그래머스 Level 1,콜라츠 추측
public class collatz {
    public int solution(int num) {
        if(num==1) return 0;
        long x = num;
        for(int i=1;i<=500;i++) {
            x = x%2==0 ? x/2 : (x*3+1);
            if(x==1) return i;
        }
        return -1;
    }
}
