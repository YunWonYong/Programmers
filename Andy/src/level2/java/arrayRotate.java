package level2.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//프로그래머스 Level 2,행렬 테두리 회전하기
public class arrayRotate {
    public int[] solution(int rows, int columns, int[][] queries) {
        List<Integer> list = new ArrayList<Integer>();
    	
    	int[][] arr = new int[rows+1][columns+1];
    	for(int i=1;i<=rows;i++) 
    		for(int j=1;j<=columns;j++)
    			arr[i][j] = (i-1)*columns + j;

    	for(int x=0;x<queries.length;x++) {
    		int row1 = queries[x][0];
    		int col1 = queries[x][1];
    		int row2 = queries[x][2];
    		int col2 = queries[x][3];          
            Stack<Integer> stack = new Stack<>();
    		
    		for(int i=col1;i<=col2;i++)
    			stack.push(arr[row1][i]);
    		for(int i=row1+1;i<=row2-1;i++)
    			stack.push(arr[i][col2]);
    		for(int i=col2;i>=col1;i--)
    			stack.push(arr[row2][i]);
    		for(int i=row2-1;i>=row1+1;i--)
    			stack.push(arr[i][col1]);
    		
    		list.add(Collections.min(stack));
    		            
    		for(int i=row1;i<=row2;i++) 
    			arr[i][col1] = stack.pop();
    		for(int i=col1+1;i<=col2-1;i++)
    			arr[row2][i] = stack.pop();
    		for(int i=row2;i>=row1;i--)
       			arr[i][col2] = stack.pop();
    		for(int i=col2-1;i>=col1+1;i--)
    			arr[row1][i] = stack.pop();
        }
        
    	
    	return list.stream().mapToInt(Integer::intValue).toArray();    
    }
    
}
