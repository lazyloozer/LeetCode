package com.hackerrank.solution;

import java.util.Scanner;

import javax.security.auth.callback.NameCallback;

public class OddConveration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(sc.hasNext()) {
			
			String name=sc.nextLine();
			for(int i=0;i<name.length();i++) {
				if(i/2==0) {
					System.out.print(name.charAt(i)+ name.charAt(i));
				}
			
			
				
				
		
			}
		}
	}
}
