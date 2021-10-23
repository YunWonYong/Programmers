package andy.level1;
import java.util.Stack;

public class ClawCrane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int item:moves) {
            item--;
            for(int i=0;i<board.length;i++) {
                if(board[i][item] != 0) {
                    if(!stack.empty() && stack.peek() == board[i][item]) {
                        stack.pop();
                        answer += 2;
                    }
                    else 
                        stack.push(board[i][item]);
                    board[i][item] = 0;
                    break;                    
                }
            }
            
        }
        
        return answer;
    }
}
