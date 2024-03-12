package com.kodnest.Sorting;


	import java.util.Scanner;

class SelectionSort1{

	    public static void main(String[] args) {

	   Scanner scan = new Scanner(System.in);

			int [] arr = new int[scan.nextInt()];

			for(int i=0 ; i<=arr.length-1 ; i++)

			{

				arr[i] = scan.nextInt();

			}

			int [] sortedArr = SelectionSort2.selectionSorting(arr);

			for(int x:sortedArr)

			{

				System.out.print(x+" ");

			}

		}

	}

	class SelectionSort2 

	{

		public static int[] selectionSorting(int [] arr)

		{

			for(int i=0 ; i<=arr.length-2 ; i++)

			{

				int min = arr[i];

				int pos = i;

				for(int j=i+1 ; j<=arr.length-1 ; j++)

				{

					if(arr[j] < min)

					{

						min = arr[j];

						pos = j;

					}	

				}

				int temp = arr[pos];

				arr[pos] = arr[i];

				arr[i] = temp;

			}

			return arr;

		}

}
