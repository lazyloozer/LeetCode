package com.kodnest.numbers;

import java.util.Scanner;

public class AutomorphicNumber {
	static boolean automorphic(int num) {
		int square=num*num;
		while(num!=0) {
			if(num%10 != square%10) {
				return false;
				
			}
			num=num/10;
			square=square/10;
		}
		return true;
	}

}
class AutomorphicNumberApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean automorphic = AutomorphicNumber.automorphic(num);
		if(automorphic==true) {
			System.out.println(num+" Is a automorphic");
		}else {
			System.out.println(num+" Not sautomorphic");
		}
	}
}
