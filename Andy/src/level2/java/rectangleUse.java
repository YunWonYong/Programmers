package level2.java;

//프로그래머스 Level 2,멀쩡한 사각형
public class rectangleUse {
	// 최대공약수
    public int gcd(int w,int h) {
        int mod = w%h;
        if(mod==0) return h;
        return gcd(h,mod);
    }
    
    public long solution(int w, int h) {
        return (long)w*h - (w+h-gcd(w,h));
    }
}
