package com.kodnest.numbers;

import java.util.Scanner;

public class PerfectNumber {
	static int perfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}
		return sum;
	}

}

class PerfectNumberApp {
	// TODO Auto-generated constructor stub
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int perfect = PerfectNumber.perfect(num);
	if(perfect==num) {
		System.out.println(num+" is Perfect");
	}
	else {
		System.out.println(num+" is Not  Perfect");
	}
}
}