package com.kodnest.numbers;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		// TODO Auto-generated method stub;
		int sum=0;
		//int n=345;
		while(n>0)
	{
			int rem=n%10;
			int quo=n/10;
			n=quo;
			sum=sum+rem;
	}
			System.out.println("the Sum of given Digits is" + sum);
		

	}

}
