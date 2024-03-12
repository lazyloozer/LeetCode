package com.kodnest.numbers;

import java.util.Scanner;

public class ArmStrong {
	static int getcount(int num) {
		int digit=0;
		int count=0;
		while(num!=0) {
			digit=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
	static int sumpower(int num,int power) {
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
	class ArmStrongApp{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int power=ArmStrong.getcount(num);
			int res=ArmStrong.sumpower(num, power);
			if(num==res) {
				System.out.println("ArmStrong");
			}else {
				System.out.println("Not ArmStrong");
			}
			
		}
	}

}
