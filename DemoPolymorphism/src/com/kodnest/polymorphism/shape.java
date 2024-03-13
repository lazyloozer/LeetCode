package com.kodnest.polymorphism;

public class shape {
	void  draw() {
		System.out.println("Drawing a shape");
	}}
	class rectangle extends shape{
		 void draw() {
			System.out.println("Drawing a rectangle");
		}
	}
	class circle extends shape{ 
		void draw() {
			System.out.println("Drawing a circle");
		}
	}
	
	class DemoShape{
		public static void main(String[]args) {
			shape shape=new shape();
			shape.draw();
//			rectangle rectangle=new rectangle();
//			rectangle.draw();
//			circle circle=new circle();
//			circle.draw();
			shape=new rectangle();
			shape.draw();
			shape=new circle();
			
			
			shape.draw();
			}
	}


