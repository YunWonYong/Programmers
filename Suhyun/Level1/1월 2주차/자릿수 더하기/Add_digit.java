/**
 * 1. 자릿수만큼 반복문 돌리기
 * 2. %10으로 나눠서 각 자릿수 더하기
 */
public class Add_digit {
    public static void main(String[] args) {
        int n=1032;
        int answer=0;
        while(true){
            answer=answer+(n%10);
            n=n/10;
            if(n==0)break;
            
        }

        System.out.println(answer);

        int i = 10;
        int num = i * i;
        
    }
    
}