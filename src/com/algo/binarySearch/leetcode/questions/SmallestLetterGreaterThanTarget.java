package com.algo.binarySearch.leetcode.questions;
/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/solution/
 */

public class SmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length -1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if (letters[mid] <= target) {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        // We are doing this because it says round up.. so wheatever the start position,
        // if it less than N then that or if n+1 then print start position
        return letters[start % letters.length];

    }
    
    
    public static void main(String[] args) {
    	
    	if ('d' > 'c') {
    		System.out.println("Greater : True");
    	}
    	else {
    		System.out.println("Greater : False");
    	}
    }
    
}
