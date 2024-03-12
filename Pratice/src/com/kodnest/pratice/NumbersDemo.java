package com.kodnest.pratice;

public class NumbersDemo {
	public static void main(String[]args) {
		// factorial
		
		
//	int n=3;
//	int fact=1;
//	for(int i=n;i>=1;i--) {
//		fact=fact*i;
//	}
//	System.out.println("the factoral="+fact);
		
		
		// sepatre line

		
//		int n=8769;
//		while(n>0) {
//			int rem=n%10;
//			int quo=n/10;
//			n=quo;
//			
//			System.out.println("Seperatecline :"+rem);
//		}
		
		
		//sum of sepearte line vales
//		int n=8769;
//		int sum=0;
//		while(n>0) {
//			int rem=n%10;
//			int quo=n/10;
//			n=quo;
//			sum=sum+rem;
//			
//			//System.out.println("Seperatecline :"+rem);
//		}
//		System.out.println(sum);
		
		// prime number
		
		int count=0;
		int n=2;
		for(int i=1;i<5;i++) {
			int rem=n%i;
			if(rem==0) {
				System.out.println(i);
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
		}
}
