/**
* 튜플
 */

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public int[] solution(String s) {
        String[] intermediate = s.substring(0, s.length() - 1).split("}");
        List<Integer> answer = new ArrayList<>();
        
        Stream.of(intermediate)
            .map((str) -> str.substring(2))
            .map(str -> str.split(","))
            .map(arr -> Stream.of(arr).collect(Collectors.toList()))
            .sorted((a, b) -> a.size() - b.size())
            .forEach(list -> match(list, answer));
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void match(List<String> list, List<Integer> answer) {
        for (String e : list) {
            Integer i = Integer.parseInt(e);
            if (answer.indexOf(i) == -1) {
                answer.add(i);
            }
        }
    } 
}