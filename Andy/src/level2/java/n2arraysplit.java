package level2.java;

// 프로그래머스 Level 2 ,n^2 배열 자르기
public class n2arraysplit {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];

        long idx = 0;
        int i = 0;
        for(long x=1;x<=n;x++) {
            if(idx>right) break;
            if(idx+n < left) {
                idx += n;
                continue;
            }
            for(long y=1;y<=n;y++) {
                long d = y<=x?x:y;            
                if(idx>=left && idx<=right) answer[i++] = (int)d;
                idx++;
            }
        }

        return answer;
    }
}
