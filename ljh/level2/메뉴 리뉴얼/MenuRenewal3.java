package Programmers.test;

import java.util.*;

/**
 * 메뉴 리뉴얼
 *      앤디님 따라해보기.
 *      orders를 순회할 때, course 요솟값에 맞춰 orders의 조합 경우의 수 뽑기 + 단어 비교 동시에.
 *      => 알파벳 경우의 수 구하기, combMap의 단어가 orders에 포함되어 있는가를 체크하는 불필요한 작업을 없앨 수 있음.
 */
public class MenuRenewal3 {
    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        boolean[] visited = new boolean[10];
        for (int c : course) {
            Map<String, Integer> combMap = new HashMap<>();
            for (String o : orders) {
                o = stringAsc(o);
                combination(combMap, visited, 0, o, c);
            }

            int max = getMax(combMap);
            if (max >= 2) {
                for (String key : combMap.keySet()) {
                    if (combMap.get(key) == max) {
                        list.add(key);
                    }
                }
            }
        }

        String[] answer = toArray(list);
        Arrays.sort(answer);
        return answer;

    }

    public String stringAsc(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public void combination(Map<String,Integer> combMap, boolean[] visited, int start, String n, int r) {
        if (r == 0) {
            put(combMap, visited, start, n);
            return;
        }
        int length = n.length();

        for (int i = start; i < length; i++) {
            visited[i] = true;
            combination(combMap, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public void put(Map<String, Integer> combMap, boolean[] visited, int last, String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < last; i++) {
            if (visited[i]) {
                sb.append(str.charAt(i));
            }
        }
        String picked = sb.toString();
        combMap.put(picked, combMap.getOrDefault(picked, 0) + 1);
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

    public String[] toArray (List<String> list) {
        String[] arr = new String[list.size()];
        int index = 0;
        for (String s : list) {
            arr[index++] = s;
        }
        return arr;
    }

}
