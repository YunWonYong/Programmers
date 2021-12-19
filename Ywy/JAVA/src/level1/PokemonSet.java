package level1;

import java.util.HashSet;
import java.util.Set;

public class PokemonSet {
	public int solution(int[] nums) {
        int answer = nums.length / 2;
        int count = duplicateRemove(nums);
        return answer > count ? count : answer;
    }
    
    private int duplicateRemove(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }
        return set.size();
    }
}
