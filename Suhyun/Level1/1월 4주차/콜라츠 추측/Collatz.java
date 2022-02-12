public class Collatz {
    public static void main(String[] args) {
        int num=1;
        long num2=num;
        int answer=0;
    
        while(answer<500){
            if(num2==1){
                System.out.println(answer);
                //return n;
                break;
            }

            if(num2%2==0){
                num2=num2/2;
            }
            else{
                num2=num2*3+1;
            }
            answer++;
        }
        answer=-1;
        System.out.println(answer);
        //return answer;
    }
}
