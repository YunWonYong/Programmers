package level1;

import java.util.ArrayList;
import java.util.List;

/*
 *	신고 결과 받기 (220129 - 220204) 
 */

// 방법1 : 2차원 배열 활용
public class Report {
	public int[] solution(String[] id_list, String[] report, int k) {
		int length = id_list.length;
		int[][] table = new int[length][length];
		List<Integer> reportedUser = new ArrayList<Integer>();
		int[] answer = new int[length];
		
		// 신고 결과 2차원 배열에 저장하기
		String[] splited;
		int i;
		int j;
		for(int l=0; l<report.length; l++) {
			splited = report[l].split(" ");
			j = searchIndex(id_list, splited[0]);
			i = searchIndex(id_list, splited[1]);
			table[i][j] = 1;
		}
		
		// 누적 신고 k개 이상인 유저 list에 저장하기
		int sum = 0;
		for(i=0; i<length; i++) {
			for(j=0; j<length; j++) {
				sum += table[i][j];
			}
			if(sum >= k) {
				reportedUser.add(i);
			}
			sum = 0;
		}
		
		// 메일 발송 수 세기
		for(j=0; j<length; j++) {
			for(int l : reportedUser) {
				answer[j] += table[l][j];
			}
		}
		
		return answer;
	}
	
	public int searchIndex(String[] id_list, String user) {
		for(int i=0; i<id_list.length; i++) {
			if(id_list[i].equals(user)) {
				return i;
			}
		}
		return -1;
	}
}
