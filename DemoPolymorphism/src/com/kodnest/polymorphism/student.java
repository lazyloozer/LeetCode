package com.kodnest.polymorphism;

public class student {
	void study() {
		System.out.println("Studing");
	}

}
class child extends student{
	void study() {
		System.out.println("Children to parent");
		
	}
	
}
class friend extends student{
	void study() {
		System.out.println("friend to his friends");
	}
}
 class demostudent{
	 public static void main(String[]args) {
		 student student=new student();
		 student.study();
		 student=new child();
		 student.study();
		 student=new friend();
		 student.study();
	 }
 }
