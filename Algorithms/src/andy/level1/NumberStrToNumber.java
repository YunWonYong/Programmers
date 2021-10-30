package andy.level1;

import java.util.Arrays;
import java.util.List;


public class NumberStrToNumber {
    public int solution(String s) {
        String str="";
        List<String> arr_str = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        // String[] arr_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String tmp="";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);           
            if(Character.isDigit(c) == true) 
                str += c;
            else {
                tmp += c;  // one
                // int idx = Arrays.asList(arr_str).indexOf(tmp);
                int idx = arr_str.indexOf(tmp);
                if(idx>=0) {
                    str += idx;
                    tmp="";                
                }                
            }
            
        }
        return Integer.parseInt(str);
    }
}
