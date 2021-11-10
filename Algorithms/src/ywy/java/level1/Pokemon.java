package ywy.java.level1;

public class Pokemon {
	public int solution(int[] nums) {
        int answer = nums.length / 2;
        int count = duplicateRemove(nums);
        return answer > count ? count : answer;
    }
    
    private static int duplicateRemove(int[] nums) {
        int[] result = new int[1];
        int index = 0;
        int range = nums.length;
        int num = nums[index];
        result[index] = num;
        int temp = num;
        while(++index < range) {
            num = nums[index];
            if (temp == num || duplicateCheck(result, num)) {
                continue;
            }
            result = expand(result, num);
            temp = num;
        } 
        return result.length;
    }
    
    private static boolean duplicateCheck(int[] arr, int checkNum) {
        int index = 0;
        int range = arr.length - 1;
        do {
            if (arr[index++] == checkNum) {
                return true;
            }
        } while(index < range);
        return false;
    }
    
    private static int[] expand(int[] arr, int num) {
        int range = arr.length;
        int[] temp = arr;
        arr = new int[range + 1];
        int index = 0;
        while(true) {
            arr[index] = temp[index++];
            if (index == range) {
                arr[index] = num;
                break;
            }
        }
        return arr;
    }
}
