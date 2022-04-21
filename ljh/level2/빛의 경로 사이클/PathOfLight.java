/**
* 빛의 경로 사이클
*/
import java.util.ArrayList;
import java.util.List;

public class PathOfLight {
    Grid[][] grids;
    int order;
    int xLength;
    int yLength;

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
                for (int k = 0; k <4; k++) {
                    if(grids[i][j].next[k] == 0 && grids[i][j].move(4, k)) {
                        answer.add(order);
                    }
                    order = 0;
                }
            }
        }

        return answer.stream().sorted().mapToInt(x -> x).toArray();
    }

    class Grid {
        int[] next = new int[4]; // up right down left
        int feature;
        int x;
        int y;

        public Grid(int x, int y, char feature) {
            this.x = x;
            this.y = y;
            setFeature(feature);
        }

        public void setFeature(char feature) {
            if (feature == 'S')
                this.feature = 2;
            else if (feature == 'R')
                this.feature = 3;
            else
                this.feature = 1;
        }

        public int nextX(int x) {
            if (x < 0) {
                return xLength - 1;
            } else if (x >= xLength) {
                return 0;
            } else {
                return x;
            }
        }

        public int nextY(int y) {
            if (y < 0) {
                return yLength - 1;
            } else if (y >= yLength) {
                return  0;
            } else {
                return y;
            }
        }

        public boolean move(int prev, int i) {
            int index;
            if (prev == 4) {
                index = i;
            } else {
                index = (prev + this.feature) % 4;
            }

            if (next[index] == 0) {
                order++;
                next[index] = order;
                int nextX = this.x;
                int nextY = this.y;
                switch(index) {
                    case 0:
                        nextY = nextY(y-1);
                        prev = 2;
                        break;
                    case 1:
                        nextX = nextX(x+1);
                        prev = 3;
                        break;
                    case 2:
                        nextY = nextY(y+1);
                        prev = 0;
                        break;
                    case 3:
                        nextX = nextX(x-1);
                        prev = 1;
                        break;
                }
                return grids[nextX][nextY].move(prev, index);
            }
            return next[index] == 1? true : false;
        }
    }
}