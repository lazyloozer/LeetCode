package com.hackerrank.solution;

import java.util.Scanner;

public class oporator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=4;
		double d=4.0;
		String s="kodnest";
		System.out.println("Enter the integer number");
		int a=sc.nextInt();
		System.out.println("Enter the double number");
		double b=sc.nextDouble();
		System.out.println("Enter the string");
		String str=sc.next();
		String string=sc.nextLine();
		
		
		int result=a+i;
		double result1=d+b;
		String string1=s.concat(string);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(string1);
		

	}

}
