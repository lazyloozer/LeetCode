package com.hackerrank.solution;

import java.util.Scanner;

public class HeightCandles {
	public static void main(String[] args) {
		
	
	     Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     String emp="";
	     for(int i=s.length()-1;i>=0;i--){
	         emp=emp+s.charAt(i);
	     }
	     if(emp.equals(s)){
	         System.out.println("YES");
	     }else{
	         System.out.println("NO");
	     }
	 }

}
