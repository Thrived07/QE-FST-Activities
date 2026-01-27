package com.example;
public class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("Car Make:"+make);
        System.out.println("Car color:"+color);
        System.out.println("Transmission:"+transmission);
        System.out.println("NUmber of Tyres:"+tyres);
        System.out.println("Number of Doors:"+doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stooped");
    }
}