package com.pb.bolshakov.hw8.test;

public class WrongConfirmPasswordException  extends Exception {
        private String detail;

        public WrongConfirmPasswordException() {
            detail = "Incorrect login";
        }

        public WrongConfirmPasswordException(String message) {
            super(message);
            detail = message;
        }

        @Override
        public String toString() {
            return "WrongConfirmPasswordException: " + detail;
        }
}




