package Programmers.test;

import java.util.*;

/**
 * 메뉴 리뉴얼
 *     개선안. orders를 한 문자로 쪼개서 Set로 만든 다음 저장하기. HashSet는 검색하는데 O(1).
 *     ㄴ 경우의 수 줄일 때, Map 사용하기. 자동캐스팅으로 인한 작업 줄이기.
 */
public class MenuRenewal2 {

    public String[] solution(String[] orders, int[] course) {
        Set[] setOrders = setOrders(orders);
        List<Character> reduce = reduce(setOrders); // 알파벳 숫자 세기
        // 알파벳 경우의 수 줄이기 => 2번 이상 나온 알파벳만 뽑아낸다.

        List<String> list = new ArrayList<>(); // 정답 넣을 리스트
        for (int r : course) {
            // list에서 r개 뽑는 경우의 수 구하기(조합). combMap에 담기.
            Map<String, Integer> combMap = new HashMap<>(); // 조합 넣을 map
            int n = reduce.size();
            boolean[] visited = new boolean[n];
            combMap = combination(combMap, reduce, visited, 0, n, r);

            //orders를 돌면서 combMap의 키 값과 비교해서 count하기.
            combMap = compare(setOrders, combMap);

            //value가 최대값을 갖는 키값 뽑아내기.
            //1. 최대값 찾기
            int max = getMax(combMap);

            //2. max 값을 갖는 key값 list에 추가
            if (max >= 2) {
                for (String key : combMap.keySet()) {
                    if (combMap.get(key) == max) {
                        list.add(key);
                    }
                }
            }
        }

        // 정답 리스트 배열로 변환
        String[] answer = new String[list.size()];
        int index = 0;
        for (String s : list) {
            answer[index++] = s;
        }
        // 배열 오름차순으로 정렬하기.
        Arrays.sort(answer);
        return answer;
    }

    // orders를 한 문자로 쪼개서 Set로 만든 다음 저장하기.
    private Set[] setOrders(String[] orders) {
        Set<Character>[] setOrders = new Set[orders.length];
        for (int i = 0; i < orders.length; i++) {
            Set set = new HashSet();
            int length = orders[i].length();
            for (int j = 0; j < length; j++) {
                set.add(orders[i].charAt(j));
            }
            setOrders[i] = set;
        }
        return setOrders;
    }

    private int getMax(Map<String, Integer> combMap) {
        int max = 0;
        for (String key : combMap.keySet()) {
            if (combMap.get(key) > max) {
                max = combMap.get(key);
            }
        }
        return max;
    }

    // 경우의 수의 알파벳이 orders에 포함되는지 비교하기
    public Map<String, Integer> compare(Set<Character>[] setOrders, Map<String, Integer> combMap) {
        for (Set<Character> o : setOrders) {
            for (String c : combMap.keySet()) {
                if (o.size() < c.length()) {
                    continue;
                }
                if (match(o, c)) {
                    combMap.put(c, combMap.get(c) + 1);
                }
            }
        }

        return combMap;
    }

    // s1안에 s2의 모든 문자가 포함되어 있는가.
    public boolean match(Set<Character> s1, String s2) {
        int length = s2.length();
        for (int i = 0; i < length; i++) {
            if (!s1.contains(s2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // 조합 추출
    public Map<String, Integer> combination(Map<String, Integer> comb, List<Character> reduce, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            // 여기선 개념상 start가 현재 포인터의 현재 위치
            return put(comb, reduce, visited, start);
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(comb, reduce, visited, i + 1, n, r - 1);
            visited[i] = false;
        }

        return comb;
    }

    // 조합해서 추출된 것 combMap에 담기.
    public Map<String, Integer> put(Map<String, Integer> combMap, List<Character> reduce, boolean[] visited, int now) {
        // List가 오름차순으로 정렬 되어 있기 때문에, 문자열도 정렬 되어 있다.
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < now; i++) {
            if (visited[i]) {
                sb.append(reduce.get(i));
            }
        }
        combMap.put(sb.toString(), 0);
        return combMap;
    }

    // 알파벳 경우의 수 줄이기.
    public List<Character> reduce(Set<Character>[] orders) {
        Map<Character, Integer> reduceMap = new HashMap<>(); // 알파벳 26개. 대문자 ASCII 65 - 90.
        List<Character> reduce = new ArrayList<>();
        for (char i = 'A'; i <='Z'; i++) {
            reduceMap.put(i, 0);
        }

        // 알파벳 개수 ++
        for (int i = 0; i < orders.length; i++) {
            Iterator iter = orders[i].iterator();
            while (iter.hasNext()) {
                Character key = (Character) iter.next();
                reduceMap.put(key, reduceMap.get(key) + 1);
            }
        }

        for (Character c : reduceMap.keySet()) {
            if (reduceMap.get(c) > 1) {
                reduce.add(c);
            }
        }
        return reduce;
    }

}
