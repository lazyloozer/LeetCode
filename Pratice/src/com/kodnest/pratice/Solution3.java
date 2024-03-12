package com.kodnest.pratice;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char [] ch=input.toCharArray();
		StringBuffer result=CreateChar(ch);
		System.out.println(result);

	}

        static StringBuffer CreateChar(char[] ch) {
		// TODO Auto-generated method stub
        	String s=new String(ch);
        	StringBuffer str=new StringBuffer(s);
		return str;
	}

}
