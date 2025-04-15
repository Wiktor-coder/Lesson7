
import java.util.Random;
import java.util.Scanner;

import static matrix.utils.MatrixManipulation.*;


public class Main {
    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        //Выводим матрицу
        System.out.println("Исходная матрица");
        printMatrix(colors);

        //Спрашиваем у пользователя угол поворота
        System.out.print("Введите угол поворота (90, 180 или 270 градусов): ");
        int angel = scanner.nextInt();

        //Выполняем поворот матрицы
        int[][] rotatedColors = rotateMatrix(colors, angel);
        //Выводим повернутую матрицу
        System.out.print("\nМатрица после поворота на " + angel + " градусов:\n");
        printMatrix(rotatedColors);
        scanner.close();
    }
}
