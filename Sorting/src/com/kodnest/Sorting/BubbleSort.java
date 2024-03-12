package com.kodnest.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {     //decending sort means a[j]<a[j+1]
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}			
		
	System.out.println("the bubble sort :");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");

	}
	}

}
