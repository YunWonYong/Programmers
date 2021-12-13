package andy.level1;


//프로그래머스 Level 1,모의고사
public class MockTest {
    public int[] solution(int[] answers) {
        int[][] arr = {{},{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] jumsu = { 0,0,0,0 };
        
        for(int idx=0;idx<answers.length;idx++) {
        	for(int i=1;i<=3;i++) {
        		if(answers[idx] == arr[i][idx%arr[i].length])                    
					jumsu[i]++;
        	}
        }  
      
        int max = Math.max(jumsu[1], Math.max(jumsu[2],jumsu[3]));        
        int cnt = 0;
        for(int i=1;i<=3;i++)  {
            if(max == jumsu[i]) cnt++;
        }        
        
        int idx = 0;
        int[] answer = new int[cnt];
        for(int i=1;i<=3;i++) 
        	if(max == jumsu[i])
        		answer[idx++] = i;

       return answer;   
    }
}
