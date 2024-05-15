package com.leetcode.code;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String s="abcabcbbdef";
//		int n=s.length();
//		Set<Character> charSet=new HashSet<>();
//		int maxlength=0;
//		int j=0;
//		for(int i=0;i<s.length();i++) {
//			if(!(charSet.contains(s.charAt(i)))) {
//				charSet.add(s.charAt(i));
//				System.out.println(charSet);
//				maxlength=Math.max(maxlength, i-j+1);
//				
//			}else {
//				while(charSet.contains(s.charAt(i))) {
//					charSet.remove(s.charAt(j));
//					
//					j++;
//				}
//				charSet.add(s.charAt(i));
//			}
//		}
//		System.out.println(maxlength);
		
		// remove duplicate values in string
		int maxlength=0;
		int j=0;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++){
			if(!(set.contains(s.charAt(i)))) {
				set.add(s.charAt(i));
				
				
			}
		}
		System.out.println(set);
		

		}
	}



