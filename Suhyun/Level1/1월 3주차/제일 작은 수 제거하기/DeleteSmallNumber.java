import java.util.Arrays;
public class DeleteSmallNumber {
    public static void main(String[] args) {
        
        int[] arr = new int[]{4,3,2,1};
        boolean flag=true;  
        //최솟값 구별위해 미리 초기화      
        int min=arr[0];
        //최솟값 위치 index
        int index=0;
        int[] answer;

        //초기화 
        if(arr.length==1){
            //return arr
            answer=new int[]{-1};
            System.out.println(answer[0]);
            
        }else{
            answer = new int[arr.length-1];
        }
        // 최솟값 index추출 
        for(int i=0; i<arr.length; i++){
            if(min>=arr[i]){
                min=arr[i];
                index=i;
            }
        }


        int j=0;
        for(int i=0; i<answer.length; i++){
            // 최솟값 위치 도달시 뛰어넘도록 
            if(i==index&&flag==true){
                i--;
                j++;
                flag=false;
                continue;
            }
            answer[i]=arr[j];
            j++;
        }
        System.out.println(Arrays.toString(answer));
        //return answer;
    }
}
