package org.example.Seminar4.hw;

import java.util.Arrays;
import java.util.LinkedList;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 12, 45,7,47,0,11, 4, 5));
        System.out.println(numbers);
        for (int i = numbers.size(); i > 0; i--) {
            System.out.print(numbers.peekLast() + ", ");
            numbers.removeLast();

        }

    }
}
