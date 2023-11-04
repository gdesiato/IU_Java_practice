package main;

public class ArrayExample {


    public double intArray(){
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        double average = 0;
        int i;

        for(i = 0; i < 5; i++ ){
            result += nums[i];
            average = result /5;
        }
        return average;
    }

    public int sumArray(){
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < n.length-1; i++){
            sum += n[i];
        }
        return sum;
    }
}
