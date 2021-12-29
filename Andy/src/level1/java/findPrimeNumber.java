package level1.java;
import java.util.Arrays;

//프로그래머스 Level 1,소수 찾기
public class findPrimeNumber {
    public int solution(int n) {
        int[] arr = new int[n+1];
        for(int i=2;i<=n;i++) {
            if(arr[i] == 2) continue;
            arr[i] = 1;
            for(int j=i*2;j<=n;j+=i) arr[j] = 2;
        }
        int sum = Arrays.stream(arr).reduce( 0,(x,y) -> {
            return x + (y==1?1:0);
        } );
        return sum;
    }
}
