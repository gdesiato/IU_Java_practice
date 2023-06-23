package main;

public class Variables {

    public static void main(String[] args) {

//        Purpose
//        As a programmer it is important to understand the state of the programme at any given time.
//        When you work with variables, you should, therefore,
//        be able to state what is inside your variable after declaration and initialization.
//
//        Code example
//        Consider the following piece of code:
        
        // Position 1
        short x, y;
        // Position 2
        x = 1234;
        // Position 3
        y = 99;
        // Position 4
        short z = x;
        // Position 5
        y = x;
        // Position 6

        int a = 2;
        int b = 2;

        if(a == b){
            System.out.println("the two ints have the same value");
        } else {
            System.out.println("the two ints do not have the same value");
        }


        ClassONe c1 = new ClassONe("Mark", "Jin", 67);
        ClassONe c2 = new ClassONe("Mark", "Jin", 67);

        if(c1 == c2){
            System.out.println("the two objs have the same value");
        } else {
            System.out.println("the two objs do not have the same value");
        }

        // different objects but same content
        // therefore same hashcode
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());


        System.out.println("equals method on c1 and c2 returns: " + c1.equals(c2));

//        Exercise
//        State what the values for the variables x, y and z are at each position during execution of the code.
//        You can use the table below. If you are unsure, use the println() method to print the variable.

        // String has already an implemented hashcode method, no need to override
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("");
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}
