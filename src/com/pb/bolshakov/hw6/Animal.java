package com.pb.bolshakov.hw6;

 public abstract class Animal {
    private String  location;
    private String color;
     private String food;
    public Animal(String  location,String color,String food){
        this.location= location;
        this.color=color;
        this.food=food;
    }

     public String getLocation() {
         return location;
     }

     public void setLocation(String location) {
         this.location = location;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getFood() {
         return food;
     }

     public void setFood(String food) {
         this.food = food;
     }

     public abstract String mareNoise();
    public abstract void eat();
    public abstract void sleep();

     @Override
     public String toString() {
         return "Animal{" +
                 " location='" +  location + '\'' +
                 ", color='" + color + '\'' +
                 ", food=" + food +
                 '}';
     }
 }

