package com.kodnest.custom;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount for withdraw");
	Scanner sc=new Scanner(System.in);
	int amount=sc.nextInt();
	try {
		withdraw(amount);
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}
	//throws classname

	  static void withdraw(int amount) throws MyException {
		int balance=1000;
		if(amount>balance) {
			//System.out.println("Insufficent Funds ");
			throw new MyException();
			// throws classname
		}
		
	}

}class MyException extends Exception{
	public MyException() {
	super("Insufficent Funds,try entering less Amount ");
	{
	}
	}
}