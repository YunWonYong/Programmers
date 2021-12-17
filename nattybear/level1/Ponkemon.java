package nattybear.level1;

import java.util.Arrays;

public class Ponkemon {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {3, 1, 2, 3};
    System.out.println(s.solution(nums));
  }
}

class Solution {
  public int solution(int[] nums) {
    int types = uniqueCount(nums);
    int max = (int) Math.floor(nums.length / 2);
    return (types >= max) ? max : types;
  }

  int uniqueCount(int[] nums) {
    int count = 1;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length-1; i++)
      if (nums[i] != nums[i+1])
        count++;
    return count;
  }
}
