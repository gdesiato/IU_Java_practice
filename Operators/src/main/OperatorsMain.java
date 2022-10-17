package main;

public class OperatorsMain {

    public static void main(String[] args) {

        // Arithmetic Operators
        // Logical Operators
        // Relational Operators

        // integers division
        int a = 7;
        int b = 5;

        int res = a / b;
        System.out.println("int division. 7 / 5 = " + res);

        // floating point numbers division
        double x = 7;
        double y = 5;

        double res2 = x  / y;
        System.out.println("double division. 7 / 5 = " + res2);


        // relational operators
        // == equality
        // on primitive data types

        int val1 = 10;
        int val2 = 10;

        boolean primEquality = val1 == val2;
        System.out.println(primEquality);

        // on reference data types

        Obj obj1 = new Obj();
        Obj obj2 = obj1;

        boolean refEquality = obj1 == obj2;
        System.out.println(refEquality);

        // logical operators
        // !, &&, ||, ^

        // String concatenation

        String s1, s2, s3, s4;
        s1 = "Hello, ";
        s2 = "how ";
        s3 = "are ";
        s4 = "you?";

        String phrase = s1 + s2 + s3 + s4;
        System.out.println(phrase);
    }
}
