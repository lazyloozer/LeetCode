package com.kodnest.pratice2;

import java.util.Arrays;
import java.util.Scanner;

public class DemoFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		String n=sc.next();
		String emp="";
		for(int i=n.length()-1;i>=0;i--) {
			emp=emp+n.charAt(i);
		}
		if(emp.equals(n)) {
			System.out.println("Not pailndrome");
		}else {
			System.out.println("Paildrome");
		}
		
		
		}
	
	
	}
	