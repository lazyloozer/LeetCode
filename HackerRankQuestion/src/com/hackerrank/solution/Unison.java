package com.hackerrank.solution;

import java.util.Scanner;

public class Unison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String emp="";
		String emp1="";
		for(int i=1;i<=n;i++) {
		String string1=sc.nextLine();
		
		char[] ch = string1.toCharArray();
	for(int j=0;j<ch.length;j++) {
		if(j%2==0) {
			emp=emp+ch[j];
		
		}else {
			emp1=emp1+ch[j];
		}
		
	}
	System.out.println(emp+" "+emp1);
	emp="";
	emp1="";
		
		}
	}

}
