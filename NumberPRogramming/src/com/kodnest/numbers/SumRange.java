package com.kodnest.numbers;

import java.util.Scanner;

public class SumRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	findsum findsum = new findsum();
	 int s=findsum.sum(a,b);
	 System.out.println(s);
	
}}
class findsum{
	int sum(int a,int b) {
		
		int sum=0;
	for(int i=a;i<=b;i++) {
		sum=sum+i;
		
	}
	return(sum);
	}
}

