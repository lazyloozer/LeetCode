package com.kodnest.Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element to search");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<(size-1);i++) {
			int count=0;
			int small=a[i];
			for(int j=(i+1);j<size;j++) {
				if(small>a[j]) {
					small=a[j];
					count++;
					 index=j;
				}
			}
			if(count!=0) {
				int x=a[i];
				a[i]=small;
				a[index]=x;
			}
			
		}
		System.out.println("The NEw sorted array : ");
			
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
