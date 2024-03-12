package com.kodnest.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice3 {

	public static void main(String[] args) {
		// find largest 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String s=sc.nextLine();
//		String res=LargestString(s);
//		System.out.println(res);
//
//	}
//
//	private static String LargestString(String s) {
//		// TODO Auto-generated method stub
//		String trim=s.trim();
//		String[]split=trim.split(" ");
//		
//		String emp="";
//		int index=0;
//		for(int i=0;i<split.length;i++) {
//			if(split[i].length()>index) {
//				emp=split[i];
//				index=split[i].length();
//				
//			}
//		}
//		return emp;
	
		//------------------------------------------------
		//frequency
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String s=sc.nextLine();
//		System.out.println("Enter the traget sttring");
//		char ch=sc.next().charAt(0);		
//		int res=FrequencyString(s,ch);
//		System.out.println("Count is :"+res);
//	}
//
//	private static int FrequencyString(String s, char ch) {
//		// TODO Auto-generated method stub
//		int count=0;
//		for(int i=0;i<s.length()-1;i++) {
//			if(ch==s.charAt(i)) {
//				count++;
//			}
//		}
//		return count;
		
		//-----------------------------------------------
		
		//Anaograms
		
//		Scanner sc=new Scanner(System.in);
// 	System.out.println("enter the string");
//	String s=sc.nextLine();
//	String s1=sc.nextLine();
//	AnaogramString(s,s1);
//		
//		
//		
//	}
//
//	private static void AnaogramString(String s, String s1) {
//		// TODO Auto-generated method stub
//		char[]ch=s.toCharArray();
//		char[]ch1=s1.toCharArray();
//		
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		
//		
//		String string=new String(ch);
//		String String1=new String(ch1);
//		
//		if(String1.equalsIgnoreCase(string)) {
//			System.out.println("Anogarms");
//		}else {
//			System.out.println("Not anograms");
//		}
		
		// vowelcount conosonent count
//		Scanner sc=new Scanner(System.in);
//	 	System.out.println("enter the string");
//		String s=sc.next();
//		int vowels=0;
//		int cononets=0;
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				vowels++;
//		}else {
//			cononets++;
//		}
//		}
//		System.out.println("vowles"+vowels);
//		System.out.println("Cononents"+cononets);
		
		// paildrome
		
		Scanner sc=new Scanner(System.in);
	 	System.out.println("enter the string");
		String s=sc.next();
		String emp="";
		for(int i=s.length()-1;i>=0;i--) {
			emp=emp+s.charAt(i);
			
		}
		if(s.equals(emp)) {
			System.out.println("PAilndrome");
		}else {
			System.out.println("Not paildrome");
		}

	}
	
	
	
	
	
	
	

}
