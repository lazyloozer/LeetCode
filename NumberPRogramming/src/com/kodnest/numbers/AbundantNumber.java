package com.kodnest.numbers;

import java.util.Scanner;

public class AbundantNumber {
	static boolean findsum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum>num) {
			return true;
		}else {
			return false;
		}
	}

}
class AbundantNumberApp{
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			
			boolean res = AbundantNumber.findsum(num);
			if(res==true) {
				System.out.println(num+" is AbundantNumber");
			}else {
				System.out.println(num+" is not AbundantNumber");
			}
		}
	}
}