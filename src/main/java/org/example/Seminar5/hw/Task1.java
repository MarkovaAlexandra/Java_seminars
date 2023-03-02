package org.example.Seminar5.hw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Task1 {
    public static void main(String[] args) {
        String myStr = "Россия идет вперед всей планеты. Планета — это не Россия. Россия - это страна.";
        String myNewStr = myStr.replaceAll("[!\"#$%&'—()*+,-./:;<=>?@\\[\\]^_`{|}~]", "").replace("  "," ").toLowerCase();
        String[] words = myNewStr.split(" ");


        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordCount.putIfAbsent(words[i], 0);
            wordCount.put(words[i], wordCount.get(words[i]) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }
}
