package org.example.Seminar3.hw;

import org.example.Seminar3.cw.Item;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Goods good = new Goods("butter", 200, 3);
        Goods good1 = new Goods("milk",150,2);
        Goods good2 = new Goods("Сыр - высший класс", 2000,1);
        Goods good3 = new Goods("Конфеты 'Высший пилотаж'", 2000,3);
        Goods good4 = new Goods("Бублики - высший класс", 70, 2);
        Goods good5 = new Goods("Высший товар", 1500,3);
        Goods good6 = new Goods("Высший товар 2", 2020,1);



        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(good);
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        goodsList.add(good5);
        goodsList.add(good6);
//        System.out.println(goodsList);

        String search = "высший";
        int maxPrice = 0;
        for (int i = 0; i < goodsList.size(); i++) {
            if ( (goodsList.get(i).getName().toLowerCase().contains(search))  &&
                (goodsList.get(i).getGrade() == 1 || goodsList.get(i).getGrade() == 2)){
//                System.out.println(goodsList.get(i));
                if(goodsList.get(i).getPrice() > maxPrice){
                    maxPrice = goodsList.get(i).getPrice();
                }

            }

        }
        System.out.println("Максимальная цена товаров 1го или 2го сорта среди товаров, " +
                "название которых содержит «высший» = "+maxPrice);


    }



}
