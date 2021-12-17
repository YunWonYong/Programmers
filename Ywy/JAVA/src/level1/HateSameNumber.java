package level1;

public class HateSameNumber {
	public HateSameNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] solution(int[] arr) {
        int range = arr.length;
        int index = 0;
        int element = arr[index];
        int addIndex = 1;
        while(++index < range) {
            element = arr[index];
            if (arr[addIndex - 1] != element) {
                arr[addIndex++] = element;
            }
        }
        int[] answer = new int[addIndex];
        System.arraycopy(arr, 0, answer, 0, addIndex);
        return answer;
    }
}
