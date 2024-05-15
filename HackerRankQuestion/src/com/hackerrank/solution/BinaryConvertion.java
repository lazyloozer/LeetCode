package com.hackerrank.solution;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryConvertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		String b = Integer.toBinaryString(n);
//		System.out.println(b);
		//method to find binary
		String str="";
		int count=0;
		while(n>0) {
			int r=n%2;
			n=n/2;
			str=r+str;
			//System.out.print(r);
		}
		System.out.println(str);
		String[] split = str.split("0");
		Arrays.sort(split);
		String res=split[split.length-1];
		System.out.println(res.length());
		
		
	}

}
