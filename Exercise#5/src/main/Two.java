package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two {

    public static void main(String[] args) {


        int[] array1 = {1, 3, 4, 4, 5, 6, 7};
        System.out.println(Arrays.toString(twoSum(array1, 8)));
        System.out.println(Arrays.toString(twoSumUnsorted(array1, 10)));


    }

    // sorted
        public static int[] twoSum(int[] nums, int target) {

            int[] arr = new int[2];

            int left = 0;
            int right = nums.length -1;

            while(left <= right){

                if (nums[left] + nums [right] == target){
                    arr[0] = left;
                    arr[1] = right;
                    return arr;
                } else if (nums[left] + nums[right] < target){
                    left += 1;
                } else {
                    right -= 1;
                }
            }
            return null;
        }

    // using HashMap for unsorted array
    public static int[] twoSumUnsorted(int[] nums, int target) {

        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is present in our hashmap.
            if (numToIndex.containsKey(complement)) {
                // If it is, return the indices.
                return new int[] { numToIndex.get(complement), i };
            }

            // Otherwise, store the current number and its index.
            numToIndex.put(nums[i], i);
        }

        // If no solution is found, you can either throw an exception or return null.
        // For this example, we'll return null.
        return null;

    }
}

