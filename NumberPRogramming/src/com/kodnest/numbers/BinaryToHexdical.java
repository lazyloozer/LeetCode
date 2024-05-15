package com.kodnest.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToHexdical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		//int n1 =Integer.parseInt(Integer.toBinaryString(n));
		//System.out.println(n1);
		String str="";
		while(n>0) {
			int r=n%2;
			n=n/2;
			str=r+str;
			
		}
		
		System.out.println(str);
		String[] split = str.split("0");
		System.out.println(split);
		//Arrays.sort(split);
		//String res=split[split.length-1];
		//System.out.println(res.length());
		
		
		
	}
	

}
