public class PtoY {
    public static void main(String[] args) {
        boolean answer =true;
        String s = "pppPppssssYYSYYY";
        char[] arr = s.toCharArray();
        int y_count = 0;
        int p_count = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (arr[i]) {
                case 89:
                case 121:
                    y_count++;
                    break;
                case 80:
                case 112:
                    p_count++;
                    break;
            }
        }
        if (y_count == 0 && p_count == 0||y_count == p_count) {
            //return answer;
            System.out.println(answer);
       } else {
            answer = false;
            //return answer;
            System.out.println(answer);
       }
        
    }
}
