package org.example.Seminar2.hw;

import java.util.Arrays;
import java.util.Scanner;

//Дан массив целых чисел.Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int [n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 9 & nums[i] < 100){
                    sum +=i;
                }
                }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0){
                    nums[i] = sum;
            }
            }
        System.out.println(Arrays.toString(nums));
        }

    }

