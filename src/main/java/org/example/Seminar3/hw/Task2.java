package org.example.Seminar3.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class Task2 {
    public static void main(String[] args) {
        Products product1 = new Products("milk", "Rus", 1.1, 300, 1);
        Products product2 = new Products("butter", "Ukr", 1.0, 110, 2);
        Products product3 = new Products("cheese", "Fin", 1.2, 100, 2);
        Products product4 = new Products("candies", "Rus", 2.1, 100, 3);
        Products product5 = new Products("bananas", "Afr", 3.1, 100, 2);
        Products product6 = new Products("oranges", "Afr", 3.1, 100, 2);
        Products product7 = new Products("jeans", "USA", 1.1, 5000, 1);


        List<Products> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);
        productsList.add(product7);
        System.out.println(productsList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый сорт товара = ");
        Integer grade = scanner.nextInt();
        List<String> countries = new ArrayList<>();

        Integer minPrice = Integer.MAX_VALUE;


        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getGrade() == grade) {
                if (productsList.get(i).getPrice() == minPrice) {
                    countries.add(productsList.get(i).getName());
                }

                if (productsList.get(i).getPrice() < minPrice) {
                    countries.clear();
                    countries.add((productsList.get(i).getName()));
                    minPrice = productsList.get(i).getPrice();
                }
            }
        }
            System.out.println(countries);

        }
    }
