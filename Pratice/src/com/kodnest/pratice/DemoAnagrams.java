package com.kodnest.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class DemoAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		String n=sc.next();
		
		char[]chararry=m.toCharArray();
		char[]chararry2=n.toCharArray();
		Arrays.sort(chararry);
		Arrays.sort(chararry2);
		
		String s1=new String(chararry);
		String s2=new String(chararry2);
		
		if(s2.equalsIgnoreCase(s1)) {
			System.out.println("ANograms");
		}else {
			System.out.println("Not Anograms");
		}

}}

