package com.kodnest.pratice;

public class MulRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		multiply(n,1);
		
			
		}

	

	private static void multiply(int n, int i) {
		if(i>10) {
			return;
		}
		System.out.println(n+"x"+i+"="+(n*i));
		multiply(n,i+1);
		}
		// TODO Auto-generated method stub
		
	}



	