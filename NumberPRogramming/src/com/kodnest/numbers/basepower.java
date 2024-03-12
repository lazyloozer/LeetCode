package com.kodnest.numbers;

import java.util.Scanner;

class basepower {
	static int basepower(int base,int exponent) {
	int power=1;
	for(int i=1;i<=exponent;i++) {
		power=power*base;
	}
	return power;
	}
}
class basepowerApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		int res=basepower.basepower(base, exponent);
	System.out.println(res);
	
	//using inbuilt funcation
//		int res=(int)Math.pow(base, exponent);
//		System.out.println(res);
	}
}