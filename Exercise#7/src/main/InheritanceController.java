package main;

public class InheritanceController {

//    Purpose
//    As a programme, we are often tasked to make a good choice for our object-oriented design.
//    The purpose of this exercise is analyse an example problem statement,
//    and to derive a possible class implementation from it.
//
//    Problem statement
//    Consider the following statement.
//    Cars and bikes are both vehicles. In general, vehicles have a current speed,
//    a maximum speed and a manufacturing date. Cars also have a motor. Bikes have a frame size.
//
//    Exercises
//    For the problem statement above, implement three classes including attribute declarations.
//    Make use of inheritance to avoid duplicate pieces of code.

    public static void main(String[] args) {

        Car car1 = new Car(100.2,190,"August 2018", 80);
        Bike bike1 = new Bike(201.5,300, "July 2020", 50);

        Vehicle car2 = new Vehicle(90,180,"March 2017");

        bike1.setFrameSize(40);
        bike1.getDescription();

        car1.getDescription();

    }
}
