package org.example.Seminar1.cw1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int product = 1;

        while(n>0){
            sum = sum + n % 10;
            product = product * (n % 10);
            n = n / 10;
        }
        int result = product - sum;
        System.out.println(result);
    }

}
