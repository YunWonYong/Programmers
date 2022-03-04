package Programmers.test;

/**
 * 행렬 테두리 회전하기 (77485)
 */

public class MatrixRotate {
    int[][] matrix;

    public int[] solution(int rows, int columns, int[][] queries) {
        matrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = j * columns + (i + 1);
            }
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotateAndSearchMin(queries[i][1] - 1, queries[i][0] - 1, queries[i][3] - 1, queries[i][2] - 1);
        }

        return answer;
    }

    public int rotateAndSearchMin(int x1, int y1, int x2, int y2) {
        int min = matrix[x1][y1];
        int temp = 0;
        int previous = matrix[x1][y1];

        for (int i = x1; i <= x2; i++) {
            temp = matrix[i][y1];
            if (temp < min) {
                min = temp;
            }
            matrix[i][y1] = previous;
            previous = temp;
        }
        for (int j = y1+1; j <= y2; j++) {
            temp = matrix[x2][j];
            if (temp < min) {
                min = temp;
            }
            matrix[x2][j] = previous;
            previous = temp;
        }
        for (int i = x2-1; i >= x1; i--) {
            temp = matrix[i][y2];
            if (temp < min) {
                min = temp;
            }
            matrix[i][y2] = previous;
            previous = temp;
        }
        for (int j = y2-1; j >= y1; j--) {
            temp = matrix[x1][j];
            if (temp < min) {
                min = temp;
            }
            matrix[x1][j] = previous;
            previous = temp;
        }

        return min;
    }
}
