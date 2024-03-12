package com.kodnest.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		char b=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(b==a.charAt(i)) {
				count++;
			}
		}
		System.out.println("the frequency"+count);
			
	
	}

}


