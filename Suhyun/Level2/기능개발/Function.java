import java.util.ArrayList;
import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        int[] progresses = { 93, 30, 55 };
        int[] speeds = { 1, 30, 5 };

        int[] day = new int[progresses.length];

        // 남은 날짜 계산
        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            day[i] = count;
        }

        // 앞에서부터 작은거 포함해서 count

        ArrayList<Integer> finish = new ArrayList<>();
        // 최댓값 찾기 처럼 처음값보다 큰 값 발견시 배열 넣기
        int max = day[0];
        int count = 0;
        for (int i = 0; i < day.length; i++) {

            if (max < day[i]) {
                max = day[i];
                finish.add(count);
                count = 0;
            }
            // 마지막으로 남을 때
            if (i == day.length - 1 && count == 0) {
                finish.add(1);
                break; // 밑에 조건문 방지용
            }
            count++;
            // 뒤에 정리
            if (i == day.length - 1) {
                finish.add(count);
            }

        }
        int[] answer = finish.stream().mapToInt(x -> x).toArray();
        System.out.println(finish);

    }
}
