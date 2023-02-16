package org.example.Seminar2.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 9;
        int[][] sud = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sud[i][j] = scanner.nextInt();
            }
        }
        /**
         * тут печатаю массив
         */
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sud[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(validSudoku(sud, size));
    }

    /**
     *
     * @param array
     * @param size размер матрицы
     * @return
     */
    public static int validSudoku(int[][] array, int size) {
        int count = 0;
        HashSet<Integer> valid = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            valid.clear();
            for (int j = 0; j < size; j++) {
                valid.add(array[i][j]);
            }
//            System.out.println("размер множества"+ i + "=" +valid.size());
            if (valid.size() != size)
                count++;
        }
        for (int j = 0; j < size; j++) {
            valid.clear();
            for (int i = 0; i < size; i++) {
                valid.add(array[i][j]);
            }
//            System.out.println("размер множества столбца"+ j + "=" +valid.size());
            if (valid.size() != size)
                count++;
        }

        int i = 0;
        int j = 0;
        int step = 0;
        int shag = 0;
        while (j < size) {
            while (i < size) {
                valid.clear();
                for (i = 0 + step; i < 3 + step; i++) {
                    for (j = 0 + shag; j < 3 + shag; j++) {
                        valid.add(array[i][j]);
                    }
                }
//                System.out.println(valid);
                if (valid.size() != size) {
                    count++;
//                    System.out.println("размер множества квадрата" + "=" + valid.size());
                }
                step += 3;
            }
            i = 0;
            step = 0;
            shag += 3;
        }
        return count;
    }
}




