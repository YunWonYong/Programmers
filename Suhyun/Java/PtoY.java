public class PtoY {
    public static void main(String[] args) {
        String s = "pPoooyY";
        char[] arr = s.toCharArray();
        int y_count = 0;
        int p_count = 0;
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            
            if (arr[i] == 80 || arr[i] == 112) {
                p_count++;
            }
            
            else if (arr[i] == 89 || arr[i] == 121) {
                y_count++;
            }
        }
        if (y_count == 0 && p_count == 0) {
            //return answer;
        } else if (y_count == p_count) {
           // return answer;
        } else {
            answer = false;
            //return answer;
        }

    }
}
