package com.pb.bolshakov.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        createNumbersFile("numbers.txt");
        createOddNumbersFile("numbers.txt");
    }
    public static void createNumbersFile(String s) throws Exception {
        try (Writer writer = new FileWriter("numbers.txt")){
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int h = 0; h < array.length; h++) {
                    array[i][h] = ((int) (Math.random() * 99 + 1));
                    System.out.print(array[i][h] + "  ");
                    writer.write(array[i][h] + " ");

                }
                writer.write("\n");
            }
        } catch (Exception e) {
            System.out.println(" Eror: "+ e);
        }}

    public static void createOddNumbersFile(String s) throws Exception {


        try (Scanner in = new Scanner(new File("numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));) {
            System.out.println("Вывод, с учетом замены целых четных чисел на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int data = line.nextInt();
                    if (data % 2 == 0) {
                        System.out.format("%d -> 0, ", data);
                        data = 0;
                    } else
                        System.out.print(data + ", ");
                    out.print(data + ", ");
                }
                line.close();
                out.println();
                System.out.println();
            }
        } catch (IOException x) { System.out.println("IO error: " + x); }

    }
}




