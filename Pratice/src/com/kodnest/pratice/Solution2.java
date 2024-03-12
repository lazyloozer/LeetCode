package com.kodnest.pratice;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String result=Captialsize(input);
		System.out.println(result);
		

	}

	 static String Captialsize(String input) {
		// TODO Auto-generated method stub
		 String[]a=input.split(" ");
		 String emp="";
		 for(int i=0;i<a.length;i++) {
			 String temp1=(a[i].charAt(0)+"").toUpperCase();
			 String temp2=temp1+a[i].substring(1);
					
		 
		return temp2;

}
		return emp;}}
