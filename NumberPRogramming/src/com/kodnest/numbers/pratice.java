package com.kodnest.numbers;

import java.util.Scanner;

public class pratice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int sum1=friend.frd(num);
		int sum2=friend.frd(num2);
		int res=sum1/num;
		int res2=sum2/num2;
		if(res==res2) {
			System.out.println("Friendly");
		}else {
			System.out.println("Not Friendly");
		}
		
	
	}
}
class friend{
	static int frd(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}