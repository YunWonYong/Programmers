public class String_Control_Default {
    public static void main(String[] args) {
        String s = "1234231";
        boolean answer =true;

        if( (4 == s.length() || s.length() == 6) && s.matches("^[0-9]+$") == true)
        {
            System.out.println(true);
            //return answer;
        }
        else {
            System.out.println(false);
            //return false;
        }
        
    }
    
}