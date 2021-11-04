package com.pb.bolshakov.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String name;
    public Dog(String  location,String color,String food,String name){
        super( location,color,food);
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "по имени:'" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String mareNoise(){
        return "Шумит";
    }
    @Override
    public void eat(){
        System.out.println("Ест");

    }
    @Override
    public void sleep(){
        System.out.println("Спать");

    }
}