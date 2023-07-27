package main;

public class Euler_1_to_10 {

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


    public int projectEuler5(){

        int number = 0;

        for(int x = 2520; x <= Integer.MAX_VALUE; x++){
            boolean isDivisibleByAll = true;

            for(int y = 1; y <= 20; y++){
                if(x % y != 0){
                    isDivisibleByAll = false;
                    break;
                }
            }

            if(isDivisibleByAll){
                number = x;
                break;
            }
        }
        return number;
    }



    public int projectEuler6(int max){

        int sumOfTheSquares = 0;
        int squareOfTheSums = 0;

        for(int x = 1; x <= max; x++){

            sumOfTheSquares += Math.pow(x,2);

            squareOfTheSums += x;

        }
        squareOfTheSums = squareOfTheSums * squareOfTheSums;

        return squareOfTheSums - sumOfTheSquares;
    }

    // projectEuler7
    // is prime number
    public boolean isPrime2(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }



    // projectEuler8
    public long maxProduct() {
        String number = "73167176531330624919225119674426574742355349194934"
                + "96983520312774506326239578318016984801869478851843"
                + "85861560789112949495459501737958331952853208805511"
                + "12540698747158523863050715693290963295227443043557"
                + "66896648950445244523161731856403098711121722383113"
                + "62229893423380308135336276614282806444486645238749"
                + "30358907296290491560440772390713810515859307960866"
                + "70172427121883998797908792274921901699720888093776"
                + "65727333001053367881220235421809751254540594752243"
                + "52584907711670556013604839586446706324415722155397"
                + "53697817977846174064955149290862569321978468622482"
                + "83972241375657056057490261407972968652414535100474"
                + "82166370484403199890008895243450658541227588666881"
                + "16427171479924442928230863465674813919123162824586"
                + "17866458359124566529476545682848912883142607690042"
                + "24219022671055626321111109370544217506941658960408"
                + "07198403850962455444362981230987879927244284909188"
                + "84580156166097919133875499200524063689912560717606"
                + "05886116467109405077541002256983155200055935729725"
                + "71636269561882670428252483600823257530420752963450";

        long maxProduct = 0;
        int length = 13;

        for (int i = 0; i < number.length() - length; i++) {
            long product = 1;
            for (int j = 0; j < length; j++) {
                product *= number.charAt(i + j) - '0'; // Subtract '0' to convert char to int
            }
            maxProduct = Math.max(product, maxProduct);
        }

        return maxProduct;
    }


    // project Euler 9

    public int[] projectEuler9() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b; // Since a + b + c = 1000
                if (a * a + b * b == c * c) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    return new int[]{a, b, c};
                }
            }
        }
        return new int[0];
    }


    // project Euler 10

    public static boolean primeCalc(long num){

        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // check if it is divisible by a number other than itself
        // we only need to check up to the square root is because a larger factor
        // of the number would be a multiple of a smaller factor that has already been checked.
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

