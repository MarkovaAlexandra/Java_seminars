package org.example.Seminar2.hw;

import java.util.Scanner;

//Дана последовательность N целых чисел. Найти сумму простых чисел.
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int count = 0;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    count += 1;
                }
            }
            if (count == 0) {
                sum += num;
            }
            count = 0;
        }

        System.out.println(sum);
    }
}

