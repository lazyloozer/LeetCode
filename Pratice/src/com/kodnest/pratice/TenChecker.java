// Assignment 1


 
package com.kodnest.pratice;
import java.util.Scanner;

public class TenChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		isMultpleTen(number);
		//method call

	}
private static void isMultpleTen(int number) {
		// TODO Auto-generated method stub
	// method defination
	if(number%10==0) {
		System.out.println("the number is multiple of 10");
	}else {
		System.out.println("the number is not multiple of 10");
	}
		
	}
	

}
