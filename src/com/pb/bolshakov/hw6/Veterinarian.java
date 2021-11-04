package com.pb.bolshakov.hw6;

import java.util.Objects;

public class Veterinarian {
    private String name;
    public Veterinarian(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinarian that = (Veterinarian) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
    public void treatAnimal(com.pb.bolshakov.hw6.Animal animal){
        if(animal.getClass()== com.pb.bolshakov.hw6.Cat.class){
            System.out.println(((com.pb.bolshakov.hw6.Cat) animal).getName()+" на лечении у ветиринара");
        }
        if(animal.getClass()== com.pb.bolshakov.hw6.Dog.class){
            System.out.println(((com.pb.bolshakov.hw6.Dog) animal).getName()+ " на лечении у ветиринара");
        }
        if (animal.getClass()== Horse.class){
            System.out.println(((Horse) animal).getName()+ " на лечении у ветиринара");
        }

}}