/**
 1. n의 약수를 구하기
 2. 반복문 안에서 answer에 더하면서 값 구하기 
 */
public class Yaksu_hap {

    public static void main(String[] args) {
        int n=5;
        int answer=0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer=answer+i;
            }
        }


        System.out.println(answer);
        //return answer;
    }
}
