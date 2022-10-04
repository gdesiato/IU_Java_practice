package main;

public class EqualityByReferenceByValue {

    public static void main(String[] args) {

//        Theory
//        In Java, we distinguish between two different  types of equality: Equality by reference and equality by value.
//
//        Code example
//        Create a class Customer() without any attributes or methods inside. Run the following code inside your main() method.

        int a1 = 3;
        int b1 = a1;
        int c1 = 3;
        System.out.println("Example 1 (with primitive data types):");
        System.out.printf("%b, %b", a1==b1, a1==c1);

        Customer a2 = new Customer();
        Customer b2 = a2;
        Customer c2 = new Customer();
        System.out.println("\n\nExample 2 (with objects):");
        System.out.printf("%b, %b", a2==b2, a2==c2);


//        Exercises
//        Study the code, run it and observe the output.
//        Explain with your own words why the results of the first and second example are different.
//        Which one is equality by reference? Which one is equality by value?

    }
}
