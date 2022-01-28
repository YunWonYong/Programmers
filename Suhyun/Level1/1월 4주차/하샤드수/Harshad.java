public class Harshad {
    public static void main(String[] args) {
        int x=11;
        int x2=x;
        int temp=0;
        boolean answer=true;
        while(true){
            temp=temp+(x%10);
            x=x/10;
            if(x==0)break;
            
        }
        if(x2%temp==0){
            System.out.println(answer);
        }
        else{
            answer=false;
            System.out.println(answer);
        }
        

        
    }
}
