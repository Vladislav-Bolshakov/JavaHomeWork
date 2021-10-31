package com.pb.bolshakov.hw4;

import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String string1,
                                      String string2) {

        String workingCopy1 = removeJunk(string1);
        String workingCopy2 = removeJunk(string2);

        workingCopy1 = workingCopy1.toLowerCase();
        workingCopy2 = workingCopy2.toLowerCase();

        workingCopy1 = sort(workingCopy1);
        workingCopy2 = sort(workingCopy2);

        return workingCopy1.equals(workingCopy2);
    }

    protected static String removeJunk(String string) {
        int i, len = string.length();
        StringBuilder dest = new StringBuilder(len);
        char c;

        for (i = (len - 1); i >= 0; i--) {
            c = string.charAt(i);
            if (Character.isLetter(c)) {
                dest.append(c);
            }
        }

        return dest.toString();
    }

    protected static String sort(String string) {
        char[] charArray = string.toCharArray();

        java.util.Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  string1,  string2;

        System.out.println();
        System.out.println("Проверка на Анаграмму");
        System.out.print("Введите первую строку : ");
        string1 = scan.nextLine();
        System.out.print("Введите вторую строку : ");
        string2 = scan.nextLine();
        System.out.println();

        if (areAnagrams(string1, string2)) {
            System.out.println("Это анаграмма!");
        } else {
            System.out.println("Не являются анаграммами друг для друга!");
        }
        System.out.println();
    }

  }
