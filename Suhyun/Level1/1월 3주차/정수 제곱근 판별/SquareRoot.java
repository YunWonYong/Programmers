/**
 * sqrt 했을 때 딱떨어지면 제곱근 
 */
public class SquareRoot {
    public static void main(String[] args) {
        long answer=0;
        long n=512312312;

        //int로는 큰 수를 못 담아서 에러 
        //int num=Long.valueOf((long)Math.sqrt(n)).intValue();
        long num=(long)Math.sqrt(n);
        
        if(num==Math.sqrt(n)){
            answer=(num+1)*(num+1);
            System.out.println(answer);
        }
        else{
            System.out.println(-1);
        }
    }
    
}