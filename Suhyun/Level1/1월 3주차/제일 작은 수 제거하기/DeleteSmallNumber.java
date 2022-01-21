import java.util.Arrays;
public class DeleteSmallNumber {
    public static void main(String[] args) {
        
        int[] arr = new int[]{4,3,2,1};
        boolean flag=true;        
        int min=arr[0];
        int index=0;
        int[] answer;
        if(arr.length==1){
            //return arr
            answer=new int[1];
            answer[0]=-1;
            System.out.println(answer[0]);
            
        }else{
            answer = new int[arr.length-1];
        }

        for(int i=0; i<arr.length; i++){
            if(min>=arr[i]){
                min=arr[i];
                index=i;
            }
        }
        int j=0;
        for(int i=0; i<answer.length; i++){
            
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
