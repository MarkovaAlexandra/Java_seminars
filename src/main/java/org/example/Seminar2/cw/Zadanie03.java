package org.example.Seminar2.cw;

/*
Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */
public class Zadanie03 {
    public static void main(String[] args) {
//        int [] numbers = new int[]{0,8,4,9,45,90,45,7,47};
//        int count = 0;
//        for (int i = 0; i < numbers.length-1; i++) {
//            if (numbers[i] == numbers[i+1]*2){
//                count ++;
//            }
//
//        }
//        System.out.println(count);
        Vector vector = new Vector(1,1,1);
        Vector vector2 = new Vector();
        Vector vector3 = new Vector(8,7, 5);


        System.out.println(vector.toString());
        System.out.println("length = " +vector.length());
        System.out.println("scalar = " + vector.scalar(vector3));
        System.out.println("mult=" + vector.vecMult(vector3));
    }
}
