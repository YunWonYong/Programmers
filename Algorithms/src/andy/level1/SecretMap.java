package andy.level1;
//프로그래머스 Level 1,[1차] 비밀지도
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++) {
            int d = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(d).replaceAll("1","#").replaceAll("0"," ");
            answer[i] = " ".repeat(n-str.length()) + str;
        }
        return answer;
    }
}
