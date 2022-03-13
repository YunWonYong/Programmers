package Programmers.test;

import java.util.*;

/**
 * 메뉴 리뉴얼
 */

public class MenuRenewal {
    public String[] solution(String[] orders, int[] course) {
        List<Character> reduce = reduce(orders); // 알파벳 경우의 수 줄이기 => 2번 이상 나온 알파벳만 뽑아낸다.

        List<String> list = new ArrayList<>(); // 정답 넣을 리스트
        for (int r : course) {
            // list에서 r개 뽑는 경우의 수 구하기(조합). combMap에 담기.
            Map<String, Integer> combMap = new HashMap<>(); // 조합 넣을 map
            int n = reduce.size();
            boolean[] visited = new boolean[n];
            combMap = combination(combMap, reduce, visited, 0, n, r);

            //orders를 돌면서 combMap의 키 값과 비교해서 count하기.
            combMap = compare(orders, combMap);

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
    public Map<String, Integer> compare(String[] orders, Map<String, Integer> combMap) {
        for (String o : orders) {
            for (String c : combMap.keySet()) {
                if (o.length() < c.length()) {
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
    public boolean match(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    // public boolean match(String s1, String s2) {
    //     char[] s1Arr = s1.toCharArray();
    //     Arrays.sort(s1Arr);
    //     int pointer = 0;
    //     int check = 0;
    //     for (int i = 0; i < s2.length(); i++) {
    //         for (int j = pointer; j < s1Arr.length; j++) {
    //             if(s2.charAt(i) == s1Arr[j]) {
    //                 pointer = j + 1;
    //                 check++;
    //             }
    //         }
    //     }
    //     return check == s2.length();
    // }

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

    // 알파벳 경우의 수 줄이기. 방법1
    public List<Character> reduce(String[] orders) {
        int[] alphabet = new int[26]; // 알파벳 26개. 대문자 ASCII 65 - 90.
        List<Character> selected = new ArrayList<>();

        // 알파벳 개수 ++
        for (int i = 0; i < orders.length; i++) {
            for (int j = 0; j < orders[i].length(); j++) {
                int index = orders[i].charAt(j) - 65;
                alphabet[index]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 1) {
                selected.add((char)(i + 65));
            }
        }

        return selected;
    }

    // 알파벳 경우의 수 줄이기. 방법2
//    public List<Character> reduce2(String[] orders) {
//        Map<Character, Integer> alphabet = new HashMap();
//        List<Character> selected = new ArrayList<>();
//        for (int i = 65; i <= 90; i++) {
//            alphabet.put((char) i , 0);
//        }
//
//        // 알파벳 개수 ++
//        for (int i = 0; i < orders.length; i++) {
//            for (int j = 0; j < orders[i].length(); j++) {
//                char key = orders[i].charAt(j);
//                alphabet.put(key, alphabet.get(key) + 1);
//            }
//        }
//
//        for (Character e : alphabet.keySet()) {
//            if (alphabet.get(e) > 1) {
//                selected.add(e);
//            }
//        }
//
//        // List로 변환할 필요 없이 개수가 2개 이상이 아닐 경우, map에서 요소를 삭제하는 것이 더 나으려나...?
//        return selected;
//    }
}
