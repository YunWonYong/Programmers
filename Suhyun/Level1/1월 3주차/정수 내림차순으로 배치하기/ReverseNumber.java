import java.util.Arrays;
import java.util.Collections;

public class ReverseNumber {

    public static void main(String[] args) {
        long n=34923495;
        String arr=Long.toString(n);
        String[] arr2=arr.split("");
        Arrays.sort(arr2,Collections.reverseOrder());

        String arr3=String.join("",arr2);
        long answer = Long.parseLong(arr3);
        System.out.println(answer);

    }
}