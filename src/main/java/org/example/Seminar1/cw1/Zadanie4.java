package org.example.Seminar1.cw1;

import java.util.Arrays;
import java.util.Scanner;

//Дан массив, проверить, симметричный ли он
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(tester(nums));

    }

    public static String tester(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return ("no");
            }
        }
        return ("yes");
    }
}