import java.util.Arrays;
import java.util.Collections;

public class Naerim {
    public static void main(String[] args) {

        String test = "abzcZddeFfg";
        // 한 글자씩 나눠서 char형식으로
        char[] arr = test.toCharArray();
        
        Arrays.sort(arr);
        
        String answer = new StringBuilder(new String(arr)).reverse().toString();
        System.out.println(answer);
    }

}
