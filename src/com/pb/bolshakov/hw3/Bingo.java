package com.pb.bolshakov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {



        try {
            while (true) {

                System.out.println ("Выберите сложность: 1 легкий,  2 средний, 3 сложный. Введите -1 в любое время, чтобы выйти из программы!");


                Scanner scanner = new Scanner(System.in);

                int count = 10;
                int guessCount = 50;
                int level = scanner.nextInt ();

                if (level == 1) {
                    count = 25;
                    guessCount = 1;
                }
                else if (level == 2) {
                    count = 10;
                    guessCount = 1;
                }
                else if (level == 3) {
                    count = 5;
                    guessCount = 1;
                }
                else if (level == -1) {
                    System.exit(0);
                }
                else {
                    System.out.println ("Сложность выбора неверна, программа завершается.");
                    System.exit(0);
                }

                int randomNum = (int) Math.round (Math.random () * 100);

                boolean bingo = false;

                for (int i = 0; i <count; i ++) {

                    System.out.println ("Введите число от 0 до 100");

                    int inputNum = scanner.nextInt ();

                    if (inputNum == -1) {
                        System.out.println ("Конец программы!");
                        System.exit(0);
                    }
                    else if (inputNum == randomNum) {
                        bingo = true;
                        break;
                    }
                    else {
                        guessCount++;
                        System.out.println ("Число, которое, Вы, написали" + (inputNum> randomNum? " больше задуманого . " : " меньше задуманого. ") + "Попытка " + guessCount + " из возможных " + count);
                    }
                }

                if (bingo) {
                    System.out.println (" Вы молодцы, это число " + randomNum );
                }
                else {
                    System.out.println ("Все время израсходовано, вы не угадали!");
                }
            }
        }
        catch (Exception e) {
            System.err.println ("Вы ввели не целое число, программа завершается!");
        }
    }
}

