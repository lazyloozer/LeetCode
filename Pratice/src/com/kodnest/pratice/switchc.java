package com.kodnest.pratice;

import java.util.Scanner;

public class switchc {

	public static void main(String[] args) {
		int n=3;
		int res=fact(n);
		System.out.println(res);
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		//int count=0;
       // System.out.println(count);
        if(n==0) {
        	return 1;
        }
        //count++;
        return n*fact(n-1);
	}
	}
	


