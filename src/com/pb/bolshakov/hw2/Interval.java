package com.pb.bolshakov.hw2;

import java.util.Scanner;

public class Interval {
    private static Scanner in;

    public static void main(String[] args) {

        byte a = 0, b = 14, d = 15, e = 35, f = 36, g = 50, h =51, j = 100;

        System.out.print("\n" + "Введите число: ");

        in = new Scanner(System.in);
        byte x = in.nextByte();

        if (x >= a && x <= b) {
            System.out.print("Число " + x + "  в интервал от " + a + " до " + b + "\n");
        } else if (x >= d && x <= e) {
            System.out.print("Число " + x + "  в интервал от " + d + " до " + e + "\n");
        } else if (x >= f && x <= g) {
            System.out.print("Число " + x + "  в интервал от " + f + " до " + g + "\n");
        } else if (x >= h && x <= j) {
            System.out.print("Число " + x + "  в интервал от " + h + " до " + j + "\n");
            System.out.print("Число " + x + " является отрицательным");
        }
    }
}
