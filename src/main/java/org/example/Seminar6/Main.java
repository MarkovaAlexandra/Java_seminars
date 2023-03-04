package org.example.Seminar6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Критерии поиска: ");
        Map<Integer, String> search = new HashMap<>();

        search.putIfAbsent(1, "brand");
        search.putIfAbsent(2, "ram");
        search.putIfAbsent(3, "price");
        search.putIfAbsent(4, "discount");
        search.putIfAbsent(5, "color");
        for (Map.Entry<Integer,String> item: search.entrySet()) {
            System.out.println(item.getKey() + "-" + item.getValue());
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер критерия поиска");
        int find = sc.nextInt();
        System.out.println("мин значение = ");
        String minimum = sc.next();

        System.out.println("макс значение = ");
        String maximum = sc.next();

        System.out.println();

        MyFilter(find, minimum, maximum,search);



    }


    public static void MyFilter(Integer find, String minimum, String maximum,Map<Integer,String> map) {

        Notebook nb0001 = new Notebook(00001, "Asus", 16, 70_000, 10, "black");
        Notebook nb0002 = new Notebook(00002, "Lenovo", 32, 80_000, 5, "black");
        Notebook nb0003 = new Notebook(00003, "Asus", 16, 75_000, 0, "pink");
        Notebook nb0004 = new Notebook(00004, "Samsung", 32, 80_000, 10, "pink");
        Notebook nb0005 = new Notebook(00005, "Asus", 16, 70_000, 10, "black");
        Notebook nb0006 = new Notebook(00006, "Asus", 16, 70_000, 10, "black");

        List<Notebook> base = new ArrayList<>();
        base.add(nb0001);
        base.add(nb0002);
        base.add(nb0003);
        base.add(nb0004);
        base.add(nb0005);
        base.add(nb0006);

        ArrayList<Notebook> resultlist = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if (find == key) {
                switch (map.get(key)) {
                    case ("brand"): {
                        System.out.println("Можем вам предложить: ");
                        for (int i = 0; i < base.size(); i++) {
                            if (base.get(i).getBrand().toLowerCase().equals(minimum.toLowerCase()) || base.get(i).getBrand().toLowerCase().equals(maximum.toLowerCase())) {
                                resultlist.add(base.get(i));
                            }
                        }
                        PrintAr(resultlist);
                        break;
                    }
                    case ("ram"): {
                        System.out.println("Можем вам предложить: ");
                        int rammin = 0;
                        int rammax = 0;
                        try {rammin = Integer.parseInt(minimum);
                            rammax = Integer.parseInt(maximum);
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Надо ввести число");  ;
                        };
                            for (int i = 0; i < base.size(); i++) {
                                if (base.get(i).getRam() >= rammin && base.get(i).getRam() <= rammax) {
                                    resultlist.add(base.get(i));
                                }
                            }
                        PrintAr(resultlist);
                            break;
                        }
                    case ("price"): {
                        System.out.println("Можем вам предложить: ");
                        int pricemin = 0;
                        int pricemax = 0;
                        try {pricemin = Integer.parseInt(minimum);
                            pricemax = Integer.parseInt(maximum);
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Надо ввести число");  ;
                        };
                        for (int i = 0; i < base.size(); i++) {
                            if (base.get(i).getPrice() >= pricemin && base.get(i).getPrice() <= pricemax) {
                                resultlist.add(base.get(i));
                            }
                        }
                        PrintAr(resultlist);
                        break;
                    }
                    case ("discount"): {
                        System.out.println("Можем вам предложить: ");
                        for (int i = 0; i < base.size(); i++) {
                            if (base.get(i).getDiscount() >= Integer.parseInt(minimum) && base.get(i).getDiscount() <= Integer.parseInt(maximum)) {
                                resultlist.add(base.get(i));
                            }
                        }
                        PrintAr(resultlist);
                        break;
                    }
                    case ("color"): {
                        System.out.println("Можем вам предложить: ");
                        for (int i = 0; i < base.size(); i++) {
                            if (base.get(i).getColour().toLowerCase().equals(minimum.toLowerCase()) || base.get(i).getColour().toLowerCase().equals(maximum.toLowerCase())) {
                                resultlist.add(base.get(i));
                            }
                        }
                        PrintAr(resultlist);
                       break;
                        }
                }
            }
        }
    }
    public static void PrintAr(ArrayList list){
        if (list.size()>0) {
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }
        }
        else{
            System.out.println("Таких нет");}
    }
}

