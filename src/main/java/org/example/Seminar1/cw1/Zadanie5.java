package org.example.Seminar1.cw1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] arr = new int []{1,2,4,5,7,6};
        int[] resArr = new int[arr.length];
        resArr[0] = arr[0];
            for (int i = 1; i < arr.length; i++){
            resArr[i] = arr[i]+resArr[i-1];
        }
        System.out.println(Arrays.toString(resArr));
    }
}
