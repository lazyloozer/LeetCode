package com.kodnest.numbers;

import java.util.Scanner;

public class QuardentPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0 && y>0) {
			System.out.println("Values is in first Quaredent");
		}else if(x<0 && y>0) {
			System.out.println("values is in second Quarendent");
		}else if(x<0 && y<0) {
			System.out.println("Third quaredent");
		}else if(x>0 && y<0) {
			System.out.println("Fourth");
		}else if(y==0 && x!=0) {
			System.out.println("x quardent");
		}else if(y!=0 && x==0) {
			System.out.println("y quardent");
		}else {
			System.out.println("Point at center");
		}

	}

}
