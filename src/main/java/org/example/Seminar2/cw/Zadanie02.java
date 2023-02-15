package org.example.Seminar2.cw;

import java.util.Scanner;
import java.util.Vector;

// Последовательность из N целых чисел. НАйти сумму чисел, оканчвающихся на 5, если перед ними четное
public class Zadanie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 % 10 == 5 && num1 % 2 == 0){
                sum +=num2;}
                num1 = num2;
                 }
        System.out.println(sum);

    }
}
