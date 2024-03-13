package com.hackerrank.solution;



	import java.io.*;
	import java.util.*;

	public class main {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A="madam";
	        String emp="";
	        for(int i=A.length()-1;i>=0;i--){
	        	//String s=(A.charAt(i)+"");
	        	emp=emp+A.charAt(i);
	        }
	        	System.out.println(emp);
	        
				
				 StringBuffer str=new StringBuffer(A); StringBuffer reverse=str.reverse();
				 System.out.println(reverse);
				 
				 
	        	
	        
	    }
	}





