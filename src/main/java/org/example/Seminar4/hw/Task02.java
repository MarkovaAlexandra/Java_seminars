package org.example.Seminar4.hw;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
public class Task02 {
    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(validSkobki(s));


    }

    public static boolean validSkobki(String s) {
        if (s.length() % 2 != 0) return false;
        if (s.startsWith("}") || s.startsWith(")") || s.startsWith("]")) return false;
        Deque<String> brackets = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("(") || s.substring(i, i + 1).equals("{") ||
                    s.substring(i, i + 1).equals("[")) {
                brackets.add(s.substring(i, i + 1));

            } else if ((s.substring(i, i + 1).equals(")") || s.substring(i, i + 1).equals("}")
                    || s.substring(i, i + 1).equals("]")) && brackets.isEmpty()) {
                return false;
            } else if (s.substring(i, i + 1).equals(")") && brackets.getLast().equals("(")
                    || s.substring(i, i + 1).equals("}") && brackets.getLast().equals("{")
                    || s.substring(i, i + 1).equals("]") && brackets.getLast().equals("[")) {
                brackets.removeLast();
            } else return false;
        }
        if (brackets.size() == 0) return true;
        else return false;
    }
}
