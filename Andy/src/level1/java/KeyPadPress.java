package level1.java;

public class KeyPadPress {
    public String solution(int[] numbers, String hand) {
		int[] left = {3,0};
		int[] right = {3,2};
		
        String answer = "";
		final String Left = "L";
		final String Right = "R";   
        final int PY = 0;
        final int PX = 1;
        if(hand.compareTo("left") == 0) hand = Left;
        else hand = Right;
		
        int[] loc = {0,0};
        String ans = Left;
        
        for(int d:numbers) {
            loc[PY] = d==0?3:(d-1)/3;
            loc[PX] = d==0?1:(d-1)%3;
            
            if(loc[PX] == 0) 
            	ans = Left;
            else if(loc[PX] == 2)
            	ans = Right;
            else {           
            	int left_len = Math.abs(loc[PX]-left[PX]) + Math.abs(loc[PY]-left[PY]); 
            	int right_len = Math.abs(loc[PX]-right[PX]) + Math.abs(loc[PY]-right[PY]);
                
            	if(left_len<right_len) 
            		ans = Left;
            	else if(left_len>right_len) 
            		ans = Right;
            	else
            		ans = hand;
            }
            
            answer += ans;
            if(ans == Left) 
                left = loc.clone();
            else 
                right = loc.clone();
        }
        
        return answer;
    }
}
