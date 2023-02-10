package org.example.Seminar1.cw1;

/*
Дана последовательность целых чисел, найти количество положительных,
после которых идут отрицательные
*/

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int count = 0;
        int num1 = scanner.nextInt();
        for (int i = 1; i < length;i++){
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0){
                count++;
            }
            num1 = num2;
        }
        System.out.println(count);
    }
}
