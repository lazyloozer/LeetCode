package com.kodnest.numbers;
//import java.util.Scanner;
public class SeperateLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number");
		int n=567;
		while(n>0) {
			int rem=n%10;
			int quo=n/10;
			n=quo;
			System.out.println(rem);
		}

	}

}


