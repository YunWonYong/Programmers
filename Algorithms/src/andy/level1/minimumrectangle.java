package andy.level1;


// 프로그래머스 Level 1,최소직사각형
public class minimumrectangle {
    public int solution(int[][] sizes) {
        int x=0,y=0;
        for(int []d:sizes) {
            if(d[0]>d[1]) {
                x = Math.max(x, d[0]);
                y = Math.max(y, d[1]);
            }
            else {
                x = Math.max(x, d[1]);
                y = Math.max(y, d[0]);
            }
        }
        return x*y;
    }
}
