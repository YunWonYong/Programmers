public class Phone {
    public static void main(String[] args) {
        String phone_number="01033334444";
        int length=phone_number.length();
        String l_number=phone_number.substring(length-4,length);
        String f_number="";
        String answer="";
        
        // 뒤에 4개만 남기고 *표시
        for(int i=0; i<length-4; i++){
            f_number+="*";
        }

        System.out.print(f_number+l_number);
        //return f_number+l_number;
    }
}
