package com.pb.bolshakov.hw3;

import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class GuessTheNumber {
    public static void main(String[] args) {

        try {
            while (true)  {

                System.out.println ("Если вы хотите закончить. Введите -1 в любое время, чтобы выйти из программы!");
                System.out.println ("Введите число от 0 до 100");
                // Создаем объект, который может получать входной поток из консоли.


                int count = 10; // Допустимое количество предположений
                int guessCount = 1; // Оставшееся время

               // Получить номер ввода из консоли и присвоить его уровню




                int randomNum = (int) Math.round (Math.random () * 100); // Получаем случайное целое число, диапазон [0-100]

                boolean bingo = false; // Если предположение верное, оно верное.

                for (int i = 0; i <count; i ++) {// Цикл в соответствии с выбранным количеством раз.
                    Scanner scanner = new Scanner(System.in);

                    int level = scanner.nextInt ();


                    int inputNum = scanner.nextInt (); // Получить номер ввода из консоли

                    if (inputNum == -1) {// - 1 конец программы
                        System.out.println ("Конец программы!");
                        System.exit(0);
                    }
                    else if (inputNum == randomNum) {// Судя по тому, что введенное число равно случайному числу, вы угадали.
                        bingo = true; // Затем измените bingo на true, чтобы указать, что предположение верное.
                        break; // Наконец, завершаем все на break
                    }
                    else {// Если указанные выше условия не выполняются
                        guessCount++; // Уменьшаем оставшееся время на 1, это эквивалентно guessCount = guessCount-1;
                        System.out.println ("Число, которое вы угадываете" + (inputNum> randomNum? " больше нужного. " : " меньше нужного. ") + "Попытка " + guessCount);
                    }
                }

                if (bingo) {// После завершения цикла судите, правильно ли вы угадали
                    System.out.println ("Правильно, это число" + randomNum  );
                }



                else {
                    System.out.println ("Все попытки исчерпаны, вы не угадали!" );
                }
            }
        }
        catch (Exception e) {
            System.err.println ("Вы ввели не целое число, программа завершается!");
        }
    }
}

