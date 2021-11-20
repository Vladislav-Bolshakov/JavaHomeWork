package com.pb.bolshakov.hw8;

import javax.swing.*;
import java.awt.event.*;

public class Auth extends JFrame implements ActionListener{

    private JTextField login;
    private JTextField password;
    private JTextField confirmPassword;

    public JTextField getLogin() {
        return login;
    }

    public JTextField getPassword() {
        return password;
    }

    public JTextField getConfirmPassword() {
        return confirmPassword;
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            checkLogInInfo(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{5,20}");
            JOptionPane.showMessageDialog(this, "Login and password are correct!",
                    "User login&password confirmation", JOptionPane.PLAIN_MESSAGE);
        } catch (com.pb.bolshakov.hw8.WrongLoginException | com.pb.bolshakov.hw8.WrongPasswordException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "UserException", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws com.pb.bolshakov.hw8.WrongLoginException, com.pb.bolshakov.hw8.WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }}