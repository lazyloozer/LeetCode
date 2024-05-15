package com.kodnest.Sorting;

import java.util.Scanner;

public class BinearySearch {
	public static int BinarySearch(int[] a,int ele) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
	
			if(a[mid]==ele) {
				return mid;
			}else if(a[mid]<ele) {
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of any Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the sorted elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the targetd array");
		
		int ele=sc.nextInt();
		
		int result=BinarySearch(a,ele);
		
		if(result!=-1) {
			System.out.println("Element was found at Index " +result);
		}else {
			System.out.println("Element was not found ");
		}
			sc.close();	
			}
	}


