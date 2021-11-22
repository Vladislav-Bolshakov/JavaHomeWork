package com.pb.bolshakov.test2;

import java.util.Scanner;

public class UserInformationTest {
    public static void main(String[] args) {
        while(true) {
            System.out.println("---------- Добро пожаловать ----------");
            System.out.println("1. Вход 2. Регистрация 3. Выход");
            System.out.println("Пожалуйста, введите ваш выбор");
            Scanner sc=new Scanner(System.in);
            UserInformationDao uid=new UserInformationDaoImpl();
            String choice = sc.nextLine();
            switch (choice) {

                // логин
                case "1":
                    System.out.println("---------- Логин ----------");

                    System.out.println("Пожалуйста, введите логин");
                    String name=sc.nextLine();
                    System.out.println("Пожалуйста, введите  пароль");
                    String password=sc.nextLine();


                    boolean flag=uid.isLogin(name, password);
                    if(flag) {
                        System.out.println("Успешный вход");
                        System.exit(0);
                    }else {
                        System.out.println("Неверное имя пользователя или пароль, вход не выполнен");
                    }
                    break;

                // зарегистрироваться
                case "2":
                    System.out.println("---------- Регистрация ----------");

                    System.out.println("Пожалуйста, введите зарегистрированное имя пользователя");
                    String newname=sc.nextLine();
                    System.out.println("Пожалуйста, введите зарегистрированный пароль");
                    String newpassword=sc.nextLine();
                    System.out.println("Пожалуйста,введите  пароль");
                    String newconfirmPassword=sc.nextLine();

                    UserInformation u=new UserInformation();
                    u.setPassworld(newpassword);
                    u.setUsername(newname);

                    uid.regist(u);

                    System.out.println("Регистрация прошла успешно");
                    break;

                // Выход
                case "3":
                    System.out.println("Спасибо за ваше использование");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод, пожалуйста, введите заново");
                    break;

            }

        }

    }


}

