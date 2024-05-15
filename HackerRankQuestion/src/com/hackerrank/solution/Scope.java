package com.hackerrank.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Difference{
	private int[]elements;
	public int maximumDifference;
	public Difference(int[] elements) {
		super();
		this.elements = elements;
		
	}
	
	public void computeDifference() {
		int maximumDifference=0;
		Arrays.sort(elements);
		int len=elements.length;
		int last=elements[len-1];
		int first=elements[0];
		maximumDifference=last-first;
		
		System.out.println(maximumDifference);
			
			
			
			
			
		}
	
		
		
	}


public class Scope {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		sc.close();
		LinkedList<Integer> ls = new LinkedList<Integer>();
		Difference d = new Difference(a);
		d.computeDifference();
		//System.out.println(d.maximumDifference);
		
		
	}

}
