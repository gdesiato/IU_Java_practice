package main;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "ciccia";
        String t = "caccii";

        Solution solution = new Solution();
        boolean x = solution.isAnagram(s,t);

        System.out.println(x);

        System.out.println(s.charAt(0));

    }

    public static class Solution {
        public boolean isAnagram(String s, String t) {
            // If lengths are not the same, they cannot be anagrams.
            if (s.length() != t.length()) {
                return false;
            }

            // Count occurrences of each character in 's' and 't'.
            int[] charCount = new int[26]; // Assuming the character set is 'a' - 'z'

            for (int i = 0; i < s.length(); i++) {
                charCount[s.charAt(i) - 'a']++;  // Increment for character in 's'
                charCount[t.charAt(i) - 'a']--;  // Decrement for character in 't'
            }

            // If all counts are zero, then 't' is an anagram of 's'
            // this for each loop checks if the 26 initialized value of charCount array are all 0
            for (int count : charCount) {
                if (count != 0) {
                    return false; // If any count is not zero, they are not anagrams
                }
            }

            return true;
        }
    }



}
