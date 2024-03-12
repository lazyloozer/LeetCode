package com.kodnest.Sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of any array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the elements ");
		for(int i=0;i<=a.length-1;i++) {
			
		a[i]=sc.nextInt();

	}
		System.out.println("Enter the targeted element");
		int ele=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++) {
			if(ele==a[i]) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Element found " +flag);
		}else {
			System.out.println("Element not found");
		}
		
		}
	
	

}
