package com.pb.bolshakov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Регестрация");
        System.out.println("Введіть ім'я користувача");
        String login = sc.nextLine();
        if(( login.contains(sp)) || login.length()<5){
            System.out.println("Невірне ім'я користувача");
            return;
        }

        System.out.println("Введіть пароль");
        String password = sc.nextLine();
        if((password.contains(sp)) || password.length()<5){
            System.out.println("Недійсний пароль");
            return;
        }
        System.out.println("Введіть повторно  пароль");
        String confirmPassword = sc.nextLine();
        if((confirmPassword.contains(sp)) || confirmPassword.length()<5){
            System.out.println("Недійсний пароль");
            return;
        }


        System.out.println( login+" ви успішно зареєстровані");

        System.out.println("Введіть ім'я користувачаe");
        String lname = sc.nextLine();
        System.out.println("Введіть пароль");
        String lpass = sc.nextLine();

        if(password.equals(lname) && password.equals(lpass)){
            System.out.println("Ласкаво просимо "+lname+" ви успішно ввійшли");
        }
        else{
            System.out.println("Невідповідність імені користувача або пароля");
        }
    }
}

