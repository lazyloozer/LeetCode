package com.kodnest.numbers;

import java.util.Scanner;

class ArmStrongrange {
	 static int count(int num) {
			int digit=0;
			int count=0;
			while(num!=0) {
				digit=num%10;
				count++;
				num=num/10;
			}
			return count;
		}
	 static int sum(int power,int num) {
			int sum=0;
			int digit=0;
			while(num!=0) {
				digit=num%10;
				int pow = (int)Math.pow(digit, power);
				sum=sum+pow;
				num=num/10;
			}
			return sum;
		}
		 
		 
		 
	 }
  class ArmStrongrangeApp{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++) {
			int power=ArmStrongrange.count(i);
			int rev=ArmStrongrange.sum(i, power);
			if(i==rev) {
				System.out.println(i+" Armstriong");
				count++;
			}
		}
		System.out.println(count);
		
	}
 }


