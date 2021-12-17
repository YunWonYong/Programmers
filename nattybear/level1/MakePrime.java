package nattybear.level1;

class Solution {
  public int solution(int[] nums) {
    int answer = 0;
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      for (int j = i+1; j < size; j++) {
        for (int k = j+1; k < size; k++) {
          int n = nums[i] + nums[j] + nums[k];
          if (isPrime(n)) answer++;
        }
      }
    }
    return answer;
  }

  boolean isPrime(int n) {
    double s = Math.sqrt(n);
    for (int i = 2; i <= s; i++)
      if (n % i == 0)
        return false;
    return n > 1;
  }
}

public class MakePrime {
  public static void main(String[] args) {
    Solution s = new Solution();

    int[] xs = {1, 2, 3, 4};
    int[] ys = {1, 2, 7, 6, 4};

    System.out.println(s.solution(xs));
    System.out.println(s.solution(ys));
  }
}
