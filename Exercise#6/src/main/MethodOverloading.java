package main;

public class MethodOverloading {

    public static void main(String[] args) {

//        Purpose
//        Often we want to overload the constructor of a class to pass a list of parameters
//        to the new object while we create it. The purpose of this exercise is to implement
//        custom constructors and trace its calls.
//
//        Theory
//        Even when we don't define a constructor ourselves, Java will still add the standard constructor.
//        However, we can implement additional constructors.
//        A constructor can call another constructor using this method this().
//
//        Code example
//        Create a class Person with the content below.
//        Inside the main() method of your Main class, run the following code:

        Person human1 = new Person("Max", "Smith", "12.02.1984");
        Person human2 = new Person(human1);

        System.out.println(human1);
        System.out.println(human2);

    }

}

//            Exercises
//                    Explain how the following line of code in the code example works.
//                    Which constructors are called in which order?
//                    Person human2 = new Person(human1);

