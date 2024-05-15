package com.leetcode.code;

public class LongestPailndrome {
	public static void main(String[] args) {
		String s="babad";
		String emp="";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			emp=emp+s.charAt(i);
			
		}
		//System.out.println(emp);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==emp.charAt(i)) {
				s1=s1+s.charAt(i);
			
				
			}
		}
		System.out.println(s1);
	}

}
