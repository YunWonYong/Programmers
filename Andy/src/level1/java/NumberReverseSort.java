package level1.java;


import java.util.Arrays;

//프로그래머스 Level 1,정수 내림차순으로 배치하기
public class NumberReverseSort {
    public long solution(long n) {
        long answer = 0;
        
        String str="";
        String str2 = String.valueOf(n);
        char[] arr = str2.toCharArray();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--) 
        	str += arr[i];
        return Long.parseLong(str);
    }
}
