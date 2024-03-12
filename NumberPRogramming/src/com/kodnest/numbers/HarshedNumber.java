package com.kodnest.numbers;

import java.util.Scanner;

public class HarshedNumber {

	static boolean harshed(int num) {
		int original=num;
		int sum=0;
		int digit=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(original%sum==0) {
			return true;
		}else {
			return false;
		}
	}
}
class HarshedNumberApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean harshed = HarshedNumber.harshed(num);
		if(harshed==true) {
			System.out.println(num+" is a harshed");
		}else {
			System.out.println(num+"Not harshed");
		}
	}
}