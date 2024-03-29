package main;

import java.util.Arrays;

import static java.lang.Math.round;
import static main.Euler_1_to_10.primeCalc;

public class DataTypes {

    public static void main(String[] args) {


//        Code example
//        Try to run the following piece of code:

        /*
        float x = 1234.123f;
        double y = 1234.123;

        System.out.println(x);
        System.out.println(y);

         */


//        Exercises
//        Why does the code fail to run?
//        How should the first line (float x = 1234.123;) be




        Euler_1_to_10 problem = new Euler_1_to_10();

        ArrayExample example = new ArrayExample();

        /*
        int a = problem.projectEuler_1();
        System.out.println("1. The sum of the multiples of 3 and 5 below 1000: " + a);

        long b = problem.projectEuler_2();
        System.out.println("2. The sum of even Fibonacci numbers not exceeding 4,000,000: " + b);

        boolean isPrime = problem.isPrime(14);
        System.out.println(isPrime);

        long n = 600851475143L;
        System.out.println("The largest prime factor of " + n + " is " + problem.projectEuler_3(n));

        int pal = problem.projectEuler_4();
        System.out.println(pal);

        int number = problem.projectEuler5();
        System.out.println("the the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + number);

        int quad = problem.projectEuler6(100);
        System.out.println(quad);



       //project Euler 7
        long max = problem.maxProduct();
        System.out.println("The max product is: " + max);
 */

        /*
        // project Euler 9
        int[] triplet = problem.projectEuler9();
        System.out.println(Arrays.toString(triplet));
        // calculate the product of the triplet
        int product = 1;
        for (int i : triplet){
            product *= i;
        }
        System.out.println(product);

         */

/*
        // project Euler 10
        long sum = 0;
        for (int i = 2; i < 2000000l; i++) {
            if (primeCalc(i)) {
                sum += i;
            }
        }
        System.out.println("The sum of all prime numbers below 2 million is: " + sum);

 */


        System.out.println("The average is: " + example.intArray());

        System.out.println("the sum is: " + example.sumArray());
    }
}
