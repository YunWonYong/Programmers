public class Subac {
    public static void main(String[] args) {
        int n=3;
        String answer="";
        
        //6.13
        for(int i=0; i<n; i++){
            answer+= i%2==0 ? "수" : "박";
        }

        // 6.84
        // int count=1;
        // for(int i=0; i<n; i++){
        //     if(count%2!=0){
        //         answer=answer+"¼ö";
        //     }
        //     else{
        //         answer=answer+"¹Ú";
        //     }
        //     count++;
        // }

        System.out.print(answer);
        //return asnwer;


    }
}
