public class XspaceN {
    public static void main(String[] args) {
        int x=2;
        int n=5;

        long[] answer=new long[n];
        long x2=x;
        long num=x2;
        
        for(int i=0; i<n; i++){
            answer[i]+=x2;
            x2+=num;
            
           
        }

        //return answer;
        
    }
}
