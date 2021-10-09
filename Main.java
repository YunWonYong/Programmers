package andy;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String s = "one4seveneight";
		
        String str="";
        String[] arr_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String tmp="";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c) == true) 
                str += c;
            else {
                tmp += c;  // one
                int idx = Arrays.asList(arr_str).indexOf(tmp);
                if(idx>=0) {
                    str += idx;
                    tmp="";
                }
            }

        }
		
        System.out.println(Integer.parseInt(str));
}
