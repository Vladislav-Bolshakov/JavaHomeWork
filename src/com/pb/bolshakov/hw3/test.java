package com.pb.bolshakov.hw3;

import java.util.Scanner;

class BiNGo {

    public static void main(String[] args) {

        System.out.println ("Угадай число:");

        try {
            while (true) {

                System.out.println (" Введите -2 в любое время, чтобы выйти из программы!");

                // Создаем объект, который может получать входной поток из консоли.
                Scanner scanner = new Scanner(System.in);

                // Допустимое количество предположений
                int guessCount = 0; // Оставшееся время
                int rand  = scanner.nextInt (); // Получить номер ввода из консоли и присвоить его уровню


                 if (rand == -1) {// Выберите -1, чтобы завершить программу
                    System.exit(0);
                }
                else {// не 1, 2, -1, завершаем программу
                    System.out.println ("Сдался, программа завершается.");
                    System.exit(0);
                }

                int randomNum = (int) Math.round (Math.random () * 100); // Получаем случайное целое число, диапазон [0-100]

                boolean bingo = false; // Если предположение верное, оно верное.


                byte count = 0;
                for (int i = 0; i < count; i ++) {// Цикл в соответствии с выбранным количеством раз.

                    System.out.println ("Введите число от 0 до 100");


                int inputNum = scanner.nextInt(); // Получить номер ввода из консоли

                    if (inputNum == -1) {// - 1 конец программы
                        System.out.println ("Конец программы!");
                        System.exit(0);
                    }
                    else if (inputNum == randomNum) {// Судя по тому, что введенное число равно случайному числу, вы угадали.
                        bingo = true; // Затем измените bingo на true, чтобы указать, что предположение верное.
                        break; // Наконец, завершаем все на break
                    }
                    else {// Если указанные выше условия не выполняются
                        guessCount--; // Уменьшаем оставшееся время на 1, это эквивалентно guessCount = guessCount-1;
                        System.out.println ("Число, которое вы угадали" + (inputNum> randomNum? "Big": "Small") + "Теперь, оставшееся время" + guessCount);
                    }
                }

                if (bingo) {// После завершения цикла судите, правильно ли вы угадали
                    System.out.println ("Как вы уже догадались, это число" + randomNum + "!  N");
                }

            }
        }
        catch (Exception e) {
            System.err.println ("Вы ввели не целое число, программа завершается!");
        }
    }
}
