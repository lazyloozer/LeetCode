package com.hackerrank.solution;

import java.util.Scanner;

abstract class Plate {
	String title;
	String author;
	int price;


abstract void display();
}
class Myplate extends Plate{
	Myplate(String title,String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}

	@Override
	void display() {
	System.out.println("Title "+title);
	System.out.println("Author "+author);
	System.out.println("Price "+price);
		
	}
	
}
class Maja{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		String author=sc.nextLine();
		int price=sc.nextInt();
		Myplate myplate = new Myplate(title,author,price);
		myplate.display();
	}
	
	
	
}
