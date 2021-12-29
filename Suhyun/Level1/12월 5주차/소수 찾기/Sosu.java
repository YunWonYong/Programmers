import java.util.ArrayList;
import java.util.List;

public class Sosu {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        int[] arr = new int[n+1];      
        arr[0] = arr[1] = 0; 

        for (int i = 2; i <= n; i++) {  
            arr[i] = i;  
        }
 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i] == 0) continue; 
            for (int j = i+i ; j <= n; j+=i) {
                  arr[j] = 0; 
                }
        }
      
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) answer++;
        }
        
        System.out.println(answer);
        //return answer;
    }
}



// 정확성 테스트에서 시간 초과
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0 ;
        
        
        for(int i = 2 ; i <= n ; i++)
        {   
            for(int j = 2 ; j <= i ; j++){
                if(i%j == 0){
                    count++;
                    if(count >= 2)break;
                }
            }
            if(count == 1){
                answer++;
            }
            count = 0;
        }
        //System.out.println(answer);
        return answer;
    }
}


//효율성 테스트 시간 초과 
//import java.util.ArrayList;
//import java.util.List;
class Solution2 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        arr.add(2);

        for(int i = 2 ; i <= n ;i++)
        {   
            for(int j = 0 ; j <= arr.size() ; j++){
                if(i%arr.get(j) == 0){
                    break;
                }
                if(j+1 == arr.size()){
                    arr.add(i);
                }
            }
            
            
        }
        //System.out.println(arr.size());
        return arr.size();
    }
}