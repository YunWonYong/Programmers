package level1.java;

import java.util.Arrays;
import java.util.Collections;

//프로그래머스 Level 1, 문자열 내림차순으로 배치하기
public class StringSortInverse {

    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array,Collections.reverseOrder());
        return String.join("",array);
    }	
}
