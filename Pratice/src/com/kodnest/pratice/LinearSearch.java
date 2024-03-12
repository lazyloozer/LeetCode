package com.kodnest.pratice;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method s

		{

		Scanner scan=new Scanner(System.in);

		int arr[]=new int[scan.nextInt()];

		for(int i=0;i<=arr.length-1;i++)

		{

		arr[i]=scan.nextInt();

		}

		int key=scan.nextInt();

		boolean res = LinearSearching.linearSearch(arr,key);

		if(res==true)

		{

		System.out.println("Key "+key+" found");

		}

		else

		{

		System.out.println("Key "+key+" not found");

		}

		}

		}

		class LinearSearching {

		static boolean linearSearch(int arr[],int key)

		{

		for(int i=0;i<=arr.length-1;i++)

		{

		if(arr[i]==key)

		{

		return true;

		}

		}

		return false;

		}

		}

	}


