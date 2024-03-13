package com.hackerrank.solution;

	import java.util.*;
	abstract class Book{
		String title;
		abstract void setTitle1(String s);
		String getTitle(){
			return title;
		}
	}
	
	class Mybook extends Book{
		
		/*
		 * String title;
		 * 
		 * public String getTitle() { return title; }
		 * 
		 * public void setTitle(String title) { this.title =title; }
		 */
	
		@Override
		void setTitle1(String s) {
			
		
			// TODO Auto-generated method stub
			

			
		}
		String getTitle() {
			return title;
		}



		public static void main(String []args){
			//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
			Scanner sc=new Scanner(System.in);
			String title=sc.nextLine();
			Mybook new_novel=new Mybook();
			new_novel.setTitle1(title);
			System.out.println("The title is: "+new_novel.getTitle());
	      	sc.close();
			
		}

		
		

	}


