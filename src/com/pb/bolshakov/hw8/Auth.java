package com.pb.bolshakov.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;
    private String confirmPassword;

    public Auth(String login,String password,String confirmPassword){
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void signUp(String login,String password,String confirmPassword)
    throws WrongLoginException,WrongPasswordException {
        if (!Pattern.matches("[\\w]{5,20}", login)) {
        } else {
            throw new WrongLoginException();

        }
        if (!Pattern.matches("[\\w]{5,20}", password)) {
        } else {
            throw new WrongPasswordException();
        }
            System.out.println("Регестрация прошла успешно");


        }

    public void signln(String login,String password)
            throws WrongLoginException,WrongPasswordException {
        if (!Pattern.matches("[\\w]{5,20}", login)) {
        } else {
            throw new WrongLoginException();
        }
        if (!Pattern.matches("[\\w]{5,20}", password)) {
        } else {
            throw new WrongPasswordException();
        }
        System.out.println("Вход прошлел успешно");


    }



}
