import java.util.Arrays;
import java.util.Collections;

public class ReverseNumber {

    public static void main(String[] args) {
        long n=34923495;
        //문자열로 만듦
        String arr=Long.toString(n);
        //숫자마다 쪼개기
        String[] arr2=arr.split("");
        // 내림차순 정렬 
        Arrays.sort(arr2,Collections.reverseOrder());
        //합치기
        String arr3=String.join("",arr2);
        // 형변환
        long answer = Long.parseLong(arr3);
        System.out.println(answer);

    }
}