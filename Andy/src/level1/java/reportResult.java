package level1.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//프로그래머스 Level 1,신고 결과 받기
public class reportResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] block_list = new int[id_list.length];
        int[] ucnt = new int[id_list.length];
        int[] idx_list = new int[id_list.length];
        
        // report의 중복값 제거
        Set<String> report2 = new HashSet<>();
        for(String d:report) {
        	report2.add(d);
        }
        
        // 빠른 검색을 위하여 id_list정렬
        String[] id_list2 = Arrays.copyOf(id_list, id_list.length);
        Arrays.sort(id_list2);
        
        // 정렬된 유저와 정렬안된 유저를 매칭하기 위한 인덱스List
        for(int i=0;i<id_list.length;i++) {
        	String d = id_list[i];
        	idx_list[i] = Arrays.binarySearch(id_list2, d);
        }
        
        // 신고당한 유저카운트 (각각의 유저가 몇번 신고당했는지카운트값 저장) 
        for(String d:report2) {
        	String[] tmp = d.split(" ");
        	int index2 = Arrays.binarySearch(id_list2, tmp[1]);
        	ucnt[index2]++;
        }
        
        // 신고한 유저들의 각각의 블럭당한 유저 카운트
        for(String d:report2) {
        	String[] tmp = d.split(" ");
        	int index = Arrays.binarySearch(id_list2, tmp[0]);
        	int index2 = Arrays.binarySearch(id_list2, tmp[1]);
        	if(ucnt[index2]>=k) block_list[index]++;
        }
               
        for(int i=0;i<id_list.length;i++) {
        	answer[i] = block_list[idx_list[i]];
        }               
        
        return answer;
    }
}
