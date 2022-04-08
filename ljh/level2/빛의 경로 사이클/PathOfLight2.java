/**
* 빛의 경로 사이클
*/

import java.util.ArrayList;
import java.util.List;

public class PathOfLight2 {
    Grid[][] grids;
    int xLength;
    int yLength;
    int order;
    int prev;
    int nextX;
    int nextY;
    int pointer;
    Grid now;

    public int[] solution(String[] grid) {
        List<Integer> answer = new ArrayList<>();
        xLength = grid.length;
        yLength = grid[0].length();
        grids = new Grid[xLength][yLength];
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                grids[i][j] = new Grid(i, j, grid[i].charAt(j));
            }
        }

        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                for (int k = 0; k < 4; k++) {
                    pointer = k;
                    prev = 4;
                    now = grids[i][j];
                    while (now.next()) {
                        now.move();
                    }
                    if (order != 0) {
                        answer.add(order);
                        order = 0;
                    }
                }
            }
        }

        return answer.stream().sorted().mapToInt(x -> x).toArray();
    }

    public int revise(int xy, int length) {
        if (xy < 0) {
            return length - 1;
        }
        if (xy >= length) {
            return 0;
        }
        return xy;
    }

    class Grid {
        private int[] direction = new int[4]; // up right down left
        private int[] position; // 현재 위치
        private int feature; // 특징
        private int index;

        public Grid(int x, int y, char feature) {
            position = new int[] {x, y};
            changeToInt(feature);
        }

        private void changeToInt(char feature) {
            switch(feature) {
                case 'L':
                    this.feature = 1;
                    break;
                case 'S':
                    this.feature = 2;
                    break;
                case 'R':
                    this.feature = 3;
                    break;
            }
        }

        public boolean next() {
            if (prev == 4) {
                index = pointer;
                return direction[pointer] == 0;
            }
            index = (prev + this.feature) % 4;
            return direction[index] == 0;
        }

        public void move() {
            direction[index] = ++order;
            cal();
            now = grids[nextX][nextY];
        }

        private void cal() {
            nextX = this.position[0];
            nextY = this.position[1];
            switch (index) {
                case 0:
                    nextY = revise(position[1] - 1, yLength);
                    prev = 2;
                    break;
                case 1:
                    nextX = revise(position[0] + 1, xLength);
                    prev = 3;
                    break;
                case 2:
                    nextY = revise(position[1] + 1, yLength);
                    prev = 0;
                    break;
                case 3:
                    nextX = revise(position[0] - 1, xLength);
                    prev = 1;
                    break;
            }
        }
    }
}