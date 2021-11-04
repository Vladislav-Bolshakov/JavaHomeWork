package com.pb.bolshakov.hw6;



public class Main {
    public static void main(String[] args) {
    Animal animal1 = new Cat("Дом", "коричневый", "корм", "Марс");
    Animal animal2 = new Dog("Дом", "черный", "каша", "Босс");
    Animal animal3 = new Horse("Канюшня", "серый", "сено", "Петруша");
        Animal[] animals = {animal1, animal2, animal3};
        printAnimal(animals);

    Veterinarian veterinarian = new Veterinarian("Андрей");
    Veterinarian veterinarian2 = new Veterinarian("Кузьмич");
    Veterinarian veterinarian3 = new Veterinarian("Василий");
        veterinarian.treatAnimal(animal1);
        veterinarian2.treatAnimal(animal2);
        veterinarian3.treatAnimal(animal3);
}
private static void printAnimal(Animal[] animals) {
        System.out.println("Список животных:");
        for (Animal animal : animals) {
            System.out.println( animal.toString());
        }
        System.out.println();
    }
}

