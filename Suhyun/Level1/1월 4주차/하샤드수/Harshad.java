public class Harshad {
    public static void main(String[] args) {
        int x=11;
        int x2=x;
        int temp=0;
        boolean answer=true;
        // 자릿수 계산 
        while(true){
            temp=temp+(x%10);
            x=x/10;
            if(x==0){
                if(x2%temp==0){
                    System.out.println(answer);
                    //return true;
                }
                //return false;
                
            }     
        }
    }
}

