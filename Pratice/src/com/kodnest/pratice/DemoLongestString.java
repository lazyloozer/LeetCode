package com.kodnest.pratice;

import java.util.Arrays;

public class DemoLongestString {

	public static void main(String[] args) {
		// longest String
	
		String s="Java IS PRogramming";
		String s1=s.trim();
		String[] split=s1.split(" ");		
		String emp="";
		int index=0;
		for(int i=0;i<split.length;i++) {
			if(split[i].length()<index) {
				emp=split[i];
				index=split[i].length();
			}
		}
		System.out.println(emp);
		
		
		//--------------------------------------------------------------
		
		//anaograms
		
		
//		String s="listen";
//		String s1="silent";
//		char[]ch=s.toCharArray();
//		char[]ch1=s1.toCharArray();
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		
//		String string=new String(ch);
//		String string1=new String(ch1);
//		
//		if(string1.equalsIgnoreCase(string1)) {
//			System.out.println("The GIven String is Anagrams");
//		}
//		else {
//			System.out.println("Not Anpgrasms");
//		}
//		
		
		//--------------------------------------------------
		//frequency
		
		
//		String s="Program";
//		char ch='r';
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(ch==s.charAt(i)) {
//				count++;
//			}
//		}
//		System.out.println("Frequency :" + count);
	}

}
