package main;

public class calc {

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
}
