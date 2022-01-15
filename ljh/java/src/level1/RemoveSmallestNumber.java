package level1;

import java.util.stream.IntStream;

/*
 * 제일 작은 수 제거하기 (220115 - 220121)
 */

public class RemoveSmallestNumber {
    // 최대한 함수 사용 지양하기
	public int[] solution(int[] arr) {
        int length = arr.length;
        if(length == 1){
            arr[0] = -1;
            return arr;
        }
        
        int[] answer = new int[length-1];
        int min = arr[0];
        int index = 0;
        for(int i=1; i<length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        
        for(int j=0; j<index; j++){
            answer[j] = arr[j];
        }
        for(int k=index+1; k<length; k++){
            answer[k-1] = arr[k];
        }
        
        return answer;
    }
    
	// 스트림 활용하기
	public int[] solution2(int[] arr) {
		if(arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
		int min = IntStream.of(arr).min().orElse(-1);
		return IntStream.of(arr).filter(v->v != min).toArray();
	}
    
}
