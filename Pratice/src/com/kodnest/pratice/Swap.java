package com.kodnest.pratice;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String res=Swapvalues(n1,n2);
		System.out.println(res);
		

	}

	private static String Swapvalues(int a, int b) {
		// TODO Auto-generated method stub
		
		a=a+b;//1 2=3a
		b=a-b;//3-2=1b
		a=a-b;//3-1=2a
		return "swapping of :"+ "a ="+ a + " b =" + b;
	}
	

}
