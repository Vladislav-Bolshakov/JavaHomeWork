package com.pb.bolshakov.hw3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        int[] a = {-5, 16, 7, -7, -9, 2, -1, 11, -5, 5};


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int sum = IntStream.of(a).sum();
        System.out.println("Сумма всех элементов " + sum);

        int countNegative = 0;
        int countPositive = 0;
        for (int value : a) {
            if (value < 0) {

            } else if(value > 0) {
                countPositive++;
            } else {
                break;
            }
        }

        System.out.println("Положительных чисел:" + countPositive);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
        System.out.println("Сортировка по возрастанию:");
        System.out.println(Arrays.toString(a));
    }
}



