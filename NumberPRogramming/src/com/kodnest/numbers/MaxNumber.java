package com.kodnest.numbers;

public class MaxNumber {
	    public static void main(String[] args) {
	        // Sample array
	        int[] array = {10, 5, 20, 8, 15};

	        // Find the maximum number
	        int max = findMax(array);

	        // Print the maximum number
	        System.out.println("The maximum number in the array is: " + max);
	    }

	    // Method to find the maximum number in an array
	    public static int findMax(int[] array) {
	        // Assuming the array has at least one element
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }
	}



