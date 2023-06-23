package main;

public class DataTypes {

    public static void main(String[] args) {


//        Code example
//        Try to run the following piece of code:

        float x = 1234.123f;
        double y = 1234.123;

        System.out.println(x);
        System.out.println(y);


//        Exercises
//        Why does the code fail to run?
//        How should the first line (float x = 1234.123;) be

//        Find the sum of all the multiples of 3 or 5 below 1000


//        int i;
//        int j;
//        int sum3 = 0;
//        int sum5 = 0;
//        for(i = 3; i < 1000; i = i + 3){
//            sum3 += i;
//        }
//        for(j = 5; j < 1000; j = j + 5){
//            sum5 += j;
//        }
//
//        System.out.println(sum3);
//        System.out.println(sum5);
//        System.out.println(sum3+sum5);
//
//
//        int sum1 = 0; // Variable to store the sum
//        int sum2 = 0; // Variable to store the sum
//        int g;
//        int m;
//        int count1 = 0;
//        int count2 = 0;
//
//        for (g = 1; g < 1000; g++) {
//            if (g % 3 == 0) {
//                count1++;
//                sum1 += g; // Add 'x' to the sum if it is a multiple of 3
//            }
//        }
//
//        for (m = 1; m < 1000; m++) {
//            if (m % 5 == 0) {
//                count2++;
//                sum2 += m; // Add 'x' to the sum if it is a multiple of 5
//            }
//        }
//
//        System.out.println("The number of multiples of 3 below 1000: " + count1);
//        System.out.println("Sum of the multiples of 3 below 1000: " + sum1);
//
//        System.out.println("The number of multiples of 5 below 1000: " + count2);
//        System.out.println("Sum of the multiples of 5 below 1000: " + sum2);
//
//        System.out.println("Sum of the totals: " + (sum1+sum2));


        calc calculator = new calc();

        int a = calculator.projectEuler_1();
        System.out.println("1. The sum of the multiples of 3 and 5 below 1000: " + a);

        long b = calculator.projectEuler_2();
        System.out.println("2. The sum of even Fibonacci numbers not exceeding 4,000,000: " + b);

    }

}
