package org.example.Seminar2.hw;

import java.util.Scanner;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isRaise(scanner,n));
    }
    public static boolean isRaise(Scanner scanner,int n) {


        int num1 = scanner.nextInt();
        int equalCount = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                return false;
            } else if (num1 == num2) {
                equalCount += 1;
            }
            num1 = num2;

        }
        scanner.close();
        if (equalCount == n - 1) {
            return false;

        } else {
            return true;

        }
    }

    }


