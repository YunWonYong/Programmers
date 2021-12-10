package ywy.java.level1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int index = 0;
        int range = n;
        String format = "%0"+n +"d";
        long binary = -1;
        do {
            binary = Long.parseLong(Long.toBinaryString(arr1[index] | arr2[index]));
            answer[index] = String.format(format, binary).replaceAll("1", "#").replaceAll("0", " ");
        } while(++index < range);
        return answer;
    }
}
