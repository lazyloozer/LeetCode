package com.kodnest.pratice;

import java.util.Scanner;

public class praticq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factorial
//		int n=5;
//		int fact=1;
//		for(int i=n;i>1;i--) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
//		
//		// sepeart line
		
//		int n=123;
//		int sum=0;
//	while(n>0) {
//		int rem=n%10;
//		int quo=n/10;
//		n=quo;
//		sum=sum+rem;
//	}
//	System.out.println(sum);
		
	//}
		
		//prime number
		
//		int n=4;
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			int rem=n%i;
//			
//		
//		if(rem==0) {
//			System.out.println(i);
//			count++;
//		}	
//		}
//		if(count==2)
//		{
//			System.out.println("prime number");
//		}else {
//			System.out.println("not prime");
//		}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			//int small=a[0];
			if(a[i]<small) {
				small=a[i];
				
			}

		}
		System.out.println(small);
		
		
	}

	}


