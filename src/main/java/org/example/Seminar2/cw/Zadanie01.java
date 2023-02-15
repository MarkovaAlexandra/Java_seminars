package org.example.Seminar2.cw;

import java.util.Scanner;

public class Zadanie01 {
    public static void main(String[] args) {
        double x;
        int n;
        double result;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        scanner.close();
        result = 1;
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
            for (int i = 0; i < n; i++) {
                result = result * x;

            }
            System.out.println(result);
        }
    }

