package main;

public class Euler {

    // Find the sum of all the multiples of 3 or 5 below 1000
    public int projectEuler_1(){

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; // Add 'i' to the sum if it is a multiple of 3 or 5
            }
        }
        return sum;
    }


    public long projectEuler_2() {
        long t1 = 0, t2 = 1;

        long sumOfEvenTerms = 0;

        while (t1 <= 4000000) {
            if(t1 % 2 == 0){
                sumOfEvenTerms += t1;
            }
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sumOfEvenTerms;
    }

    // Is it a prime number?
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Find the largest prime factor
    public long projectEuler_3(long n) {
        long maxPrime = -1;

        // Handle 2 as a special case
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        // n is odd at this point, so increment by 2
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // At this point, if n is a prime number greater than 2, then n itself is the largest prime
        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }


    public int projectEuler_4(){
    int maxPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                }
            }
        }

       return maxPalindrome;
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int remainder;
        int original = number;

        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        return original == reversed;
    }
}

