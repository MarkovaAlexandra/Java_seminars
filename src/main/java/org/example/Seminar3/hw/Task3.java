package org.example.Seminar3.hw;

import java.util.ArrayList;
import java.util.List;
//Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания после 2010 г, включительно.
public class Task3 {
    public static void main(String[] args) {
        Books book1 = new Books("Е.Онегин", "А.С.Пушкин", 500, 1998, 500);
        Books book2 = new Books("Медный всадник", "A.Пушкин", 500, 2022, 310);
        Books book3 = new Books("Сказки", "Пушкин", 500, 2012, 371);
        Books book4 = new Books("Руслан и Людмила", "Пушкин А.С.", 500, 2020, 151);
        Books book5 = new Books("Маленькие трагедии", "Пушкин", 500, 1998, 273);
        Books book6 = new Books("Капитанская дочка", "А.С.Пушкин", 500, 2003, 457);
        Books book7 = new Books("Пиковая дама", "Пушкин А.С.", 500, 2020, 229);
        Books book8 = new Books("Метель", "пушкин ас", 500, 2012, 250);


        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        for (int i = 0; i < booksList.size(); i++) {
            if ((booksList.get(i).getAuthor().toLowerCase().contains("а"))
                    && booksList.get(i).getYear() >= 2010
                    && booksList.get(i).isPrime(booksList.get(i).getPages())) {
                System.out.println(booksList.get(i));
            }

        }
    }
}
