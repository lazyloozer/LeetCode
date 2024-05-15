package com.kodnest.pratice;

import java.util.Scanner;

class zero {
	public static void main(String[] args) {
		boolean l = LinearSearch();
		if(l==true) {
			System.out.println(" Found");
		}else {
			System.out.println("Not found");
		}
		
		
			
		
	}

	private static boolean LinearSearch() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
				
			}
			return false;
		}
		return false;
		
		
		
		
	}
		
}

