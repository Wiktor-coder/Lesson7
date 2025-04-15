package matrix.utils;


public class MatrixManipulation {
    public static final int SIZE = 8;

    //Вывод матрицы на экран
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    //Метод для поворота матрицы
    public static int[][] rotateMatrix(int[][] matrix, int angle) {
        int[][] rotated = new int[SIZE][SIZE];

        switch (angle) {
            case 90:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotated[j][SIZE - 1 - i] = matrix[i][j];
                    }
                }
                break;
            case 180:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotated[SIZE - 1 - i][SIZE - 1 - j] = matrix[i][j];
                    }
                }
                break;
            case 270:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotated[SIZE - 1 - j][i] = matrix[i][j];
                    }
                }
                break;
        }
        return rotated;
    }
}
