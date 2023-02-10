package org.example.Seminar1.cw1;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringIn = scanner.nextLine();
        StringBuilder stringOut = new StringBuilder();
        stringOut.append(stringIn.substring(stringIn.length()/2,stringIn.length()));
        stringOut.append(stringIn.substring(0,stringIn.length()/2));
        System.out.println(stringOut);
    }
}
