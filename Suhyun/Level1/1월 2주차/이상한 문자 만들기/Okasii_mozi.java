/**
 * 1. 반복문 돌리기
 * 2. 공백 나오면 인덱스 초기화 
 * 3. 대소문자 바꿔주기
 * 4. 결과값 출력 
 */

 /**
  * 1. 공백 기준으로 배열만들기
  * 2. 배열 기준으로 인덱스 재서 대소문자 변경
  * 3. 배열들 문자열로 바꾸고 배열마다 공백추가 출력
  */
public class Okasii_mozi {
    public static void main(String[] args) {
        String s="try hello world";
        
        int count=0;
        char[] arr=s.toCharArray();

        for(int i=0; i<s.length() ; i++){
            if (arr[i]==' '){
                count=0;
                continue;
            }
            else if(count%2==0){
                arr[i]=Character.toUpperCase(arr[i]);
            }
            else if(count%2!=0){
                arr[i]=Character.toLowerCase(arr[i]);
            }
            count++;

        }
        String answer=new String(arr);


        System.out.println(answer);
        //return answer;
    }
}