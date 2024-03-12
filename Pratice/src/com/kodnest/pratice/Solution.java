package com.kodnest.pratice;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is Fun";
		int a[]=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==32)
			{
				a[i]=32;
			}
		}
		int j=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=32) {
				if(a[j]!=32)
						{
					a[j]=s.charAt(i);
					}else {
						j++;
						continue;
					}
						}else {
							continue;
		}
		}
		for(int i=0;i<=s.length()-1;i++) {
	}
		
	
			

	}}

