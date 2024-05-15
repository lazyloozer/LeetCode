package com.kodnest.numbers;

import java.util.Scanner;

public class StrongNumber {
	static int strong(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	static boolean detectstrong(int num) {
		int digit=0;
		int temp=num;
		int sum=0;
		while(temp!=0) {
			digit=temp%10;
			sum=sum+strong(digit);
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}else {
			return false;
		}
	
	}

}

class StrongApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean detectstrong = StrongNumber.detectstrong(n);
		if(detectstrong==true) {
			System.out.println("The "+n+"is Strong");
		}else {
			System.out.println("The "+n+"is not XStrong");
		}
		
		
	}
}