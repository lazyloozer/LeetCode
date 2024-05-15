package com.kodnest.custom;

import java.util.Scanner;



public class custom {
	public static void main(String[] args) throws myexception1 {
		int a=100;
		
		
		greater(a);
				
	}

	private static void greater(int a) throws myexception1 {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		if(b>a) {
			throw new myexception1();
			
		}
		
	}
	}
	class myexception1 extends Exception{
		public myexception1() {
			super("b is greater than a so not possible");
		}
	}
		

