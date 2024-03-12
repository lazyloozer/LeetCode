package com.kodnest.pratice;

public class RemoveDup {

	public static void main(String[] args) {
		// REMOVE DUPLICATTIONṇ
		String s="Program";
		String s1="";
		for(int i=0;i<=s.length()-1;i++) {
		if(!(s1.contains(s.charAt(i)+"")))
			{
				s1=s1+s.charAt(i);		
				}
		
		}		
		System.out.println(s1);	
		
		}
}

//reverse string
//String s="Manu";
//String s1="";
//for(int i=s.length()-1;i>=0;i--) {
//	s1=s1+s.charAt(i);
//}
//System.out.println(s1);
	
//}}