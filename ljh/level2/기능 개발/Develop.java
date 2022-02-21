// package Programmers.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 기능 개발 (42586)
 */

public class Develop {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length]; // 배포 가능 일자
        List<Integer> release = new ArrayList<>(); // 배포 시 기능의 개수

        // 배포 가능 일자 구하기
        for (int i = 0; i < progresses.length; i++)
            days[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);

        int count = 1;
        int now = days[0];
        for (int i = 1; i < days.length; i++) {
            if (now >= days[i]) {
                count++;
            } else {
                release.add(count);
                count = 1;
                now = days[i];
            }
        }

        if (count > 1)
            release.add(count);

        return release.stream().mapToInt(Integer::intValue).toArray();
    }
}
