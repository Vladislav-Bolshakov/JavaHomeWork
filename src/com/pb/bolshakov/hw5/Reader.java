package com.pb.bolshakov.hw5;

public class Reader {
    private String fio;
    private int number;
    private String faculty;
    private String dob;
    private String phone;

    public Reader(String fio, int number, String faculty, String dob, String phone) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.dob = dob;
        this.phone = phone;
    }

    public Reader() {}

    public String getFio() {return fio;}

    public void setFio(String fio) {this.fio = fio;}

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public String getFaculty() {return faculty;}

    public void setFaculty(String faculty) {this.faculty = faculty;}

    public String getDob() {return dob;}

    public void setDob(String dob) {this.dob = dob;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public void takeBook(int number) {
        System.out.println(this.fio + " взял " + number + " книги.");}

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял  книги:");
        for (String book : books) {
            System.out.println(book);}
        System.out.println();
    }
    public void takeBook(Book... books) {
        System.out.println(this.fio + "взял книги:");
        for (Book book : books) {
            System.out.println("Название книги: " +book.getName() + ", автор - " + book.getAuthor()+
                    ", год выпуска-" +book.getYear());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул  книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул  книги:");
        for (Book book : books) {
            System.out.println("Название книги: " +book.getName() + ", автор - " + book.getAuthor()+
                    ", год выпуска-" +book.getYear());
        }
        System.out.println();
    }


    public String getInfo() {
        return "[ ФИО: " + fio  +
                ", Читательский: " + number +
                ", факультет: " + faculty +
                ", дата рождения: " + dob  +
                ", телефон: " + phone + "]";
    }
}