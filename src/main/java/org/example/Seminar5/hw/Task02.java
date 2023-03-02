package org.example.Seminar5.hw;

import java.util.*;

/**
 * 2) Подсчитать количество искомого слова,
 * через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Task02 {
    public static void main(String[] args) {
        String text = "мама? , ^ ^; ' ;; , сшила мне штаны. qwe qwe qwe из березовой. коры мама сшила мама сшила мама сшила мне штаны.";
        String [] words = deletePunct(text).split(" ");
//        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для поиска: ");
        String find = scanner.nextLine();
        Map<String,Integer> findWord = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(find)){
                findWord.putIfAbsent(find,0);
                findWord.put(find,findWord.get(find)+1);
            }
        }
        System.out.println("слово "+ find + " встречается " + findWord.get(find) + " раз(а)");
        }
    public static String deletePunct (String string){
        return string.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
    }
}
