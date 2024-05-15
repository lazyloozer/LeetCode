package com.hackerrank.solution;

import java.util.Scanner;

class Person {
	 protected String firstName;
	 protected String lastName;
	 protected int idNumber;
	 Person(String firstName,String lastName,int idNumber){
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.idNumber=idNumber;
		 
	 }
	 public void printPerson() {
		 System.out.println("Name:"+lastName+","+firstName+"\nID:"+idNumber);
		 
	 }
		
	
}
 class child extends Person{
		int[]scores;
	 child(String firstName, String lastName, int idNumber,int[]scores) {
		super(firstName, lastName, idNumber);
		this.scores=scores;
		// TODO Auto-generated constructor stub
	}
	 char calculate() {
		 int sum=0;
		 for(int i=0;i<scores.length;i++) {
			 sum=sum+scores[i];
			 int avg=sum/scores.length;
			 if(avg>=90 && avg<=100) {
				 return 'o';
				 }else if(avg>=80 && avg<=90) {
					 return'a';
				 }else if(avg>=70 && avg<=80) {
					 return 'f';
				 }
		 }
		return 0;
		
	 }


	 
 }
class Mian{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName=sc.next();
		String lastName=sc.next();
		int idNumber=sc.nextInt();
		int n=sc.nextInt();
		int []scores=new int[n];
		for (int a = 0; a < scores.length; a++) {
			scores[a]=sc.nextInt();
		}
		child child = new child(firstName,lastName,idNumber,scores);
		child.printPerson();
		System.out.println("Grade "+child.calculate());
	
	}
 }
