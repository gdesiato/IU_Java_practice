package main;

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




        Euler problem = new Euler();

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

         */

       //project Euler 7
        int counter = 0;

        for (int k = 1; k <= Integer.MAX_VALUE; k++){
            if(problem.isPrime2(k)){
                counter++;
                // System.out.println("this is prime number n." + counter + ":" + k);
                if(counter == 10001){
                    System.out.println("this is the prime number number 10001: " + k);
                    break;
                }
            }
        }
    }
}
