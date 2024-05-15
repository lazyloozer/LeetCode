package com.kodnest.numbers;

public class AddandRemove {
	    public static void main(String[] args) {
	        // Original array
	        int[] originalArray = {10, 20, 30, 40, 50};
	        
	        // Add element
	        int[] newArray = addElement(originalArray, 60);
	        
	        // Remove element
	        newArray = removeElement(newArray, 2); // Removes the element at index 2
	        
	        // Print elements
	        for (int num : newArray) {
	            System.out.println(num);
	        }
	    }

	    // Method to add an element to the array
	    public static int[] addElement(int[] array, int element) {
	        int[] newArray = new int[array.length + 1];
	        for (int i = 0; i < array.length; i++) {
	            newArray[i] = array[i];
	        }
	        newArray[array.length] = element;
	        return newArray;
	    }

	    // Method to remove an element from the array
	    public static int[] removeElement(int[] array, int index) {
	        if (index < 0 || index >= array.length) {
	            return array;
	        }
	        int[] newArray = new int[array.length - 1];
	        for (int i = 0, j = 0; i < array.length; i++) {
	            if (i != index) {
	                newArray[j++] = array[i];
	            }
	        }
	        return newArray;
	    }
	}


