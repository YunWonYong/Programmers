package Programmers.test;

/**
 * 타겟 넘버 (43165)
 */

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        if (sum == target)
            count = 1;

        return listSearch(numbers, 0, target, sum, count);
    }

    public int listSearch (int[] numbers, int pointer, int target, int sum, int count) {
        for (int i = pointer; i < numbers.length; i++) {
            int minus = sum - (numbers[i] * 2);
            if (minus == target)
                count++;
            else if (minus > target)
                count = listSearch (numbers, i + 1, target, minus, count);
        }

        return count;
    }
}
