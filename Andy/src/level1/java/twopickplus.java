package level1.java;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//프로그래머스 Level 1, 두 개 뽑아서 더하기
class twopickplus {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++)
                set.add(numbers[i]+numbers[j]);
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array);
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }
}