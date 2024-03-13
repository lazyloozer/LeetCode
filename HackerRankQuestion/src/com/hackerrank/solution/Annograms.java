package com.hackerrank.solution;
import java.util.Scanner;

public class Annograms {



	    static boolean isAnagram(String a, String b) {
	        if(a.length() !=b.length()){
	            return false;
	        }
	        char[] c=a.toLowerCase().toCharArray();
	        char[] ch=b.toLowerCase().toCharArray();
	        
	        java.util.Arrays.sort(c);
	        java.util.Arrays.sort(ch);
	        for(int i=0;i<c.length;i++){
	            if(c[i]!=ch[i]){
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}


