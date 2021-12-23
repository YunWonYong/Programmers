package level1.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//프로그래머스 Level 1, 문자열 내 마음대로 정렬하기
class SortCompare  implements Comparator<String> {
    public int idx;
    SortCompare(int i) { idx = i; }
    public int compare(String a, String b) {
        if(a.charAt(idx) == b.charAt(idx)) {
            return a.compareTo(b);
        }
        return Integer.compare(a.charAt(idx),b.charAt(idx));
    }
}


public class StringSortMine {
    public String[] solution(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);
        Collections.sort(list, new SortCompare(n));
        return list.toArray(new String[list.size()]);
    }
}