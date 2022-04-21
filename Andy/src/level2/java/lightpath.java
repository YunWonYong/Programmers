package level2.java;
import java.util.*;

//프로그래머스 Level 2,빛의 경로 사이클
class Grid {
    Grid(String type) {  stype = type; }
    
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    
    public static final int[] arrowOutS = { RIGHT,LEFT,DOWN,UP };
    public static final int[] arrowOutR = { DOWN,UP,LEFT,RIGHT };
    public static final int[] arrowOutL = { UP,DOWN,RIGHT,LEFT };
    
    private String stype;
    public int[] inArr = { 0,0,0,0 };
    public int[] outArr = { 0,0,0,0 };
     
    public int getInput(int arrow) {
        if(stype.equals("S")) return arrowOutS[arrow];
        if(stype.equals("R")) return arrowOutR[arrow];
        if(stype.equals("L")) return arrowOutL[arrow];
        return 0;
    }
}

public class lightpath {
    public Grid[][] arr;
    
    public int trace(int x,int y,int aw) {
    	if(arr[x][y].inArr[aw] > 0) {
            return -1;
        }
        
		int row=x, col=y, arrow = aw;
		int cnt = 1;		
		for(;;) {
			arrow = arr[row][col].getInput(arrow);
			arr[row][col].outArr[arrow] = cnt;
			cnt++;

            if(arrow == Grid.LEFT) col--;  if(col<0) col=arr[row].length-1;            
            if(arrow == Grid.RIGHT) col = (col + 1) % arr[row].length;
            if(arrow == Grid.UP) row--; if(row<0) row = arr.length-1;
            if(arrow == Grid.DOWN) row = (row + 1) % arr.length;

            arrow = (arrow+1)%2 + (arrow/2)*2;

            arr[row][col].inArr[arrow] = cnt;
                  
            if(row == x && col == y && aw == arrow) {                
                return cnt/2;
            }
            cnt++;			
		}
    }
    
    public int[] solution(String[] grid) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        int row = grid.length;
        int col = grid[0].length();
        arr= new Grid[row][col];
        for(int i=0;i<row;i++) {
            String str = grid[i];
            for(int j=0;j<col;j++) {
                arr[i][j] = new Grid(""+str.charAt(j));                
            }
        }
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                for(int k=Grid.LEFT;k<=Grid.DOWN;k++) {
                    int ret = trace(i,j,k);
                    if(ret>0) {
                        list.add(ret);    
                    } 
                }
            }
        }

        list.sort(null);    
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    } 
}
