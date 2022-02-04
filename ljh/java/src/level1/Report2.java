package level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *	신고 결과 받기 (220129 - 220204) 
 */

// 방법2 : Map, HashSet 활용
public class Report2 {
	public int[] solution(String[] id_list, String[] report, int k) {
		Map<String, HashSet> reported = new HashMap<String, HashSet>();
		Map<String, Integer> countMap = new HashMap<String,Integer>();
		String[] splited;
		Set<String> hs;
		Iterator<String> iter;
		int[] answer = new int[id_list.length];
		
		// 신고 결과 저장하기. Key : 신고 당한 사람, value : 신고한 사람
		for(int i=0; i<report.length; i++) {
			splited = report[i].split(" ");
			if(!reported.containsKey(splited[1])) {
				reported.put(splited[1], new HashSet<String>());
			}
			reported.get(splited[1]).add(splited[0]);
		}
		
		// 신고 누적 횟수가 k개 이상인 유저 추출 및 countMap에 메일 발송 수 집계하기. key : 메일 발송자, value : 발송 수
		for(String e : reported.keySet()) {
			hs = reported.get(e);
			if(hs.size() >= k) {
				iter = hs.iterator();
				while(iter.hasNext()) {
					countUp(countMap, iter.next());
				}
			}
		}
		
		// countMap 내용을 answer에 할당하기
		for(int i=0; i<id_list.length; i++) {
			if(countMap.containsKey(id_list[i])) {
				answer[i] = countMap.get(id_list[i]);
			}else {
				answer[i] = 0;
			}
		}
		
		return answer;
		
	}
	
	public Map<String, Integer> countUp(Map<String, Integer> map, String key){
		if(!map.containsKey(key)) {
			map.put(key, 0);
		}
		int count = map.get(key);
		map.put(key, count+1);
		return map;
	}
}
