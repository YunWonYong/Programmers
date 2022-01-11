import java.util.Arrays;

public class Reverse_number {
    public static void main(String[] args) {
        long n=123123123;
        int num=(int)(Math.log10(n)+1);
        int[] answer=new int[num];
        
        for(int i=0; i<num; i++){
            answer[i]=(int)(n%10);
            n=n/10;
        }

        System.out.println(Arrays.toString(answer));
        //return asnwer;
    }
}
