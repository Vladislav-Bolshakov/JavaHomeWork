package com.pb.bolshakov.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        String [] words = s.split("\\s+");
        String snew = "";
        for (String word : words) {
            snew = snew + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println(snew.trim());

    }
}



