package level1.java;

import java.util.HashSet;
import java.util.Set;

//프로그래머스 Level 1,폰켓몬
public class Pokemon {
    public int solution(int[] nums) {
        int answer = 0;      
        int cnt = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int d:nums) set.add(d);
        if(cnt<set.size()) answer = cnt;
        else answer = set.size();
        return answer;
    }
}
