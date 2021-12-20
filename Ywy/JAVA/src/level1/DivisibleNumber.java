package level1;

public class DivisibleNumber {

	public int[] solution(int[] arr, int divisor) {
        int index = 0;
        int range = arr.length;
        int addIndex = 0;
        int element = 0;
        double divi = divisor * 1.0;
        do {
            element = arr[index];
            if (check(element / divi)) {
                arr[addIndex++] = element;
            }
        } while(++index < range);
        if (addIndex == 0) {
            return new int[]{-1};
        }
        final int[] answer = new int[addIndex];
        System.arraycopy(arr, 0, answer, 0, addIndex);
        java.util.Arrays.sort(answer);
        return answer;
    }
    
    private boolean check(double d) {
        String temp = String.valueOf(d);
        int dotIndex = temp.indexOf(".");
        if (temp == null || temp.equals("0") || dotIndex == -1) {
            return false;
        }
        temp = temp.replace(".", "");
        return strToInt(temp.substring(0, dotIndex)) > 0 &&
               temp.substring(dotIndex, temp.length()).equals("0");
    }
    
    private long strToInt(String str) {
        return Long.parseLong(str);
    }

}
