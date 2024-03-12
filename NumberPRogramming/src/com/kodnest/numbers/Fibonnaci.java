package com.kodnest.numbers;

import java.util.Scanner;

public class Fibonnaci {
	static void fibonnaci(int n) {
		int num1=0;
		int num2=1;
		if(n==1) {
			System.out.print(num1);
		}
		else if(n==2) {
			System.out.print(num1+" "+num2);
		}else {
			System.out.print(num1+" "+num2+" ");
		
	
	for(int i=3;i<=n;i++) {
		int fib=num1+num2;
		System.out.print(fib+" ");
		num1=num2;
		num2=fib;
	}
	}
	}

}
class FibonnaciApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fibonnaci.fibonnaci(n);
		
	}
}
