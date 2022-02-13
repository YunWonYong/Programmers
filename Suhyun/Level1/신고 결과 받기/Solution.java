import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // 하나의 출력 인덱스
        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        int k = 2;

        Map<String, Integer> id = new HashMap<String, Integer>();

        // 중복제거용
        String[] stream = Arrays.stream(report).distinct().toArray(String[]::new);
        // System.out.println(Arrays.toString(stream));

        for (int i = 0; i < id_list.length; i++) {

            id.put(id_list[i], 0);
        }
        Map<String, Integer> id_mail = new HashMap<String, Integer>();
        id_mail.putAll(id);

        for (int i = 0; i < stream.length; i++) {
            String[] wakare = stream[i].split(" ");
            id.put(wakare[1], id.get(wakare[1]) + 1);
            // if (id.get(wakare[1]) >= k) {
            // // id_mail.put(wakare[1], id_mail.get(wakare[1]) + 1);
            // id_mail.put(wakare[1], id_mail.get(wakare[1]) + 1);
            // }
        }

        for (int i = 0; i < stream.length; i++) {
            String[] wakare = stream[i].split(" ");

            if (id.get(wakare[1]) >= k) {
                // id_mail.put(wakare[1], id_mail.get(wakare[1]) + 1);
                id_mail.put(wakare[0], id_mail.get(wakare[0]) + 1);
            }

        }
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id.size(); i++) {
            answer[i] = id_mail.get(id_list[i]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
