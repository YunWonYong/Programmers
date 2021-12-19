package level1;

public class InnerProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int index = 0;
        final int range = a.length;
        do {
            answer += (a[index] * b[index++]);
        } while(index < range);
        return answer;
    }
}
