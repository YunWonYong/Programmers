package level1;

import java.util.Arrays;

/*
 * 정수 내림차순으로 배치하기(220115 - 220121)
 */

public class ArrangeIntegerInDescendingOrder {

    // 각 자리수에 -1 곱한 숫자 배열 만들어서 정렬 후 연산으로 Long 타입 변수 만들어서 반환
    public long solution(long n) {
        int[] arr = new int[(int)Math.log10(n)+1];
        long answer;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(-1 * (n%10));
            n /= 10;
        }
        
        Arrays.sort(arr);

        answer = -arr[0];
        for(int i=1; i<arr.length; i++){
            answer = answer*10 - arr[i];
        }
        
        return answer;
    }
    
    // 문자 배열 만들어서 정렬 후 뒷문자부터 문자열에 이어 붙임 => Long 타입 변환 후 반환
    public long solution2(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        StringBuffer sb = new StringBuffer((int)Math.log10(n)+1);
        
        for(int i=chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        
        return Long.valueOf(sb.toString());
    }
    
    // 문자 배열 만들어서 정렬, StringBuffer의 append 후 reverse 함수 이용 => Long 타입 변환 후 반환
    public long solution3(long n) {
    	char[] arr = String.valueOf(n).toCharArray();
    	Arrays.sort(arr);
    	
        StringBuffer sb = new StringBuffer();
        sb.append(arr).reverse();
        
        return Long.valueOf(sb.toString());
    }
}
