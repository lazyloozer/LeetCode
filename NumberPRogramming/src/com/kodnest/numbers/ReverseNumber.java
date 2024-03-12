package com.kodnest.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=0;
		int rev=0;
		while(num!=0) {
			//take last number to digit by below logic
			digit=num%10;
			//add to revser with * 10
			rev=rev*10+digit;
			//remove that number
			num=num/10;
		}
		System.out.println(rev);
	}

}
