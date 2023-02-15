package org.example.Seminar2.hw;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        int equalCount = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                count += 1;
            } else if (num1 == num2) {
                equalCount += 1;
            }
            num1 = num2;

        }
        scanner.close();
        if (count > 0 || equalCount == n - 1) {
            System.out.println("Последовательность не возрастающая");
        } else {
            System.out.println("Последовательность возрастающая");

        }
    }
}
