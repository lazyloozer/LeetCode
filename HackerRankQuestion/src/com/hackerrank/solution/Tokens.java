package com.hackerrank.solution;


	import java.io.*;
	import java.util.*;
	public class Tokens {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        s.trim();
	    String[] split=s.split("[^A-Za-z]+");
	    
	    if(s.length()==0){
	        System.out.println("0");
	    }else{
	        System.out.println(split.length);
	    }
	    for (String string : split) {
	        System.out.println(string);
	        
	    }
	        scan.close();
	    }
	}




