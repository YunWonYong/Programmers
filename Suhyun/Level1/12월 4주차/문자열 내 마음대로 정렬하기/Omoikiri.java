import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Omoikiri {
    public static void main(String[] args) {
        String[] strings = {"sun","bed","car"};
        int n = 2;
        String[] answer = new String[strings.length];
        

        ArrayList<String> array = new ArrayList<>();
            
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(array);
        
        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }
        System.out.println(Arrays.toString(answer));
        //return answer;
        
    }
}
