package com.kodnest.numbers;
	import java.util.Scanner;

	public class Pailndrome {

		public static boolean isPalindrome(int number) {

//			int originalNumber = number;
//
//			int reversedNumber = 0;
//
//			while (number > 0) {
//
//				int digit = number % 10;
//
//				reversedNumber = reversedNumber * 10 + digit;
//
//				number /= 10;
//
//			}
//			return originalNumber == reversedNumber;
		
		int originalnumber=number;
		int reversenumber=0;
		while(number>0) {
			int digit=number%10;
			reversenumber=reversenumber*10+digit;
			number/=10;
		}
		return originalnumber==reversenumber;
		}
		
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
             int number = scanner.nextInt();

//			if (isPalindrome(number)) {
//				System.out.println(number + " is a palindrome.");
//			} else {
//				System.out.println(number + " is not a palindrome.");
//
//			}
             if(isPalindrome(number)) {
            	 System.out.println(number);
             }else {
            	 System.out.println("not polly");
            	 
             }
			scanner.close();

		}

	}


