package com.hackerrank.solution;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisorSum(int n);
}

 class Calcultor implements AdvancedArithmetic  {

	@Override
	public int divisorSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
	
		// TODO Auto-generated method stub
		return sum;
	}
	
	
}
public class Sumfactor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		AdvancedArithmetic myCalcultor=new Calcultor();
		int sum = myCalcultor.divisorSum(n);
		System.out.println("I impleemented:"+myCalcultor.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
		sc.close();
		
	}
}