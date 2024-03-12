package com.kodnest.pratice;

import java.util.Scanner;

public class PraticeTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of any array");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int[][] b;
		if(m==n) {
			b=new int[m][n];
		}else {
			b=new int[n][m];
		}
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("THe original array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			b[j][i]=a[i][j];
			}
		}
		System.out.println("THe Transpose array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
		System.out.print(b[i][j]+" ");

			}
			System.out.println();
			}
	}

}
