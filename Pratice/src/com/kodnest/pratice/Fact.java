package com.kodnest.pratice;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	while(n>0){
		int rem=n%10;
		int quo=n/10;
		n=quo;
		sum=sum+rem;
	}
		System.out.println(sum);
		}}
	
