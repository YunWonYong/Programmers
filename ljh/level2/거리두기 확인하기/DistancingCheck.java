package Programmers.test;

/**
 * 거리두기 확인하기
 **/

public class DistancingCheck {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < places.length; i++) {
            answer[i] = distancing(places[i]);
        }
        return answer;
    }

    public int distancing(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i].charAt(j) == 'P' && !move(arr, j, i, 0, 0))
                    return 0;
            }
        }
        return 1;
    }

    public boolean move(String[] arr, int x, int y, int n, int next) { // -1 : left, 0 : down, 1 : right
        if (n > 2 || y == 5 || x == -1 || x == 5)
            return true;

        char c = arr[y].charAt(x);
        if (n != 0 && c == 'P')
            return false;
        if (c == 'X')
            return true;
        if (next == 0)
            return move(arr, x + 1, y, n + 1, 1) && move(arr, x -1, y, n + 1, -1) && move(arr, x, y + 1, n + 1, 0);

        return move(arr, x + next, y, n + 1, next) && move(arr, x, y + 1, n + 1, next);
    }
}
