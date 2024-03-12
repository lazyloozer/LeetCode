
package com.kodnest.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	int n=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++) {
		int rem=n%i;
		if(rem==0) {
			System.out.println(i);
			count++;
		}
	}
	if(count==2) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}

	}

}
