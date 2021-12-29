package level1;

/*
 * 프로그래머스 - 같은 숫자는 싫어
 * 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지.
 * - 배열 arr의 크기 : 1,000,000 이하의 자연수
 * - 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 */

public class HateSameNumber {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer;
		
		// solution 함수 호출
		answer = solution(arr);

		// answer 요소 출력
		for(int num : answer) {
			System.out.println(num);
		}
	}
	
	public static int[] solution(int[] arr) {
		int curr = -1;
		int index = 0;
		int[] copy = new int[arr.length];

		for(int i=0; i<arr.length; i++) {
			if(arr[i] != curr) {
				curr = arr[i];
				copy[index] = arr[i];
				index++;
			}
		}
		
		int[] answer = new int[index];
		System.arraycopy(copy, 0, answer, 0, index);
		
		return answer;
	}
}
