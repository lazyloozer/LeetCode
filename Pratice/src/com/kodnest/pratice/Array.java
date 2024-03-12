package com.kodnest.pratice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("enter the size ");
		for(int i=1;i<=size-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the elemts:");
		for(int i=1;i<=size-1;i++) {
			
			System.out.println("the marks are"+ a[i]);
			
		}

	}

}
