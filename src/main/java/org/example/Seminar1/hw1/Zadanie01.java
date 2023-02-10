package org.example.Seminar1.hw1;

import java.util.Scanner;

/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
 */
public class Zadanie01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        System.out.println(given);
        StringBuilder result = new StringBuilder();
        String [] words = given.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            result.append(words[i] + " ");
        }
        System.out.println(result);
    }
}
