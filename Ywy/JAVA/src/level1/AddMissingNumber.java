package level1;

public class AddMissingNumber {
    public int solution(final int[] numbers) {
    	bubbleSort(numbers);
        int answer = 0;
        int[] eqNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int eqIndex = 0;
        int index = 0;
        int range = numbers.length;
        int eqRange = eqNumbers.length;
        int eqNum = -1;
        int num = -1;
        while(eqIndex < eqRange) {
            eqNum = eqNumbers[eqIndex++];
            num = numbers[index < range ? index : range - 1];
            if (eqNum == num) {
            	index++;
                continue;
            }
            answer += eqNum;
        }
        return answer;
    }
    
    private void bubbleSort(final int[] numbers) {
        int index = 0;
        int range = numbers.length - 1;
        int prev = -1;
        int next = -1;
        while(index < range) {
            prev = numbers[index];
            next = numbers[++index];
            if (prev > next) {
                numbers[index] = prev;
                numbers[--index] = next;
                --index;
                index = index < 0 ? 0 : index;
            }
        }
    }
}
