package com.kodnest.numbers;

import java.util.Scanner;

public class Factor {

	static void printfactor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
class factorApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factor.printfactor(num);
	}
}
