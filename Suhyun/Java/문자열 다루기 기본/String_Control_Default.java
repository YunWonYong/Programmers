public class String_Control_Default {
    public static void main(String[] args) {
        String s = "1234231";
        boolean answer =true;

        //숫자인지 아닌지 파악 
        if( s.matches("^[0-9]+$")==false )
        {
            System.out.println(false);
            //return false;
        }
        //길이가 4 혹은 6
        else if(4==s.length() && s.length()==6){
            System.out.println(answer);
            //return answer;
        }
        else {
            System.out.println(false);
            //return false;
        }
        
    }
    
}