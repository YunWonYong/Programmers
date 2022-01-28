/**
 * sqrt 했을 때 딱떨어지면 제곱근 
 */
public class SquareRoot {
    public static void main(String[] args) {
        long answer=0;
        long n=512312312;

        //int로는 큰 수를 못 담아서 에러 
        //int num=Long.valueOf((long)Math.sqrt(n)).intValue();
        //sqrt: 숫자에 루트씌움 
        long num=(long)Math.sqrt(n);
        
        // 소숫점이 있으면 제곱근이 아님 
        if(num==Math.sqrt(n)){
            answer=(num+1)*(num+1);
            System.out.println(answer);
        }
        //같지 않으면 제곱근 아님 
        else{
            System.out.println(-1);
        }
    }
    
}