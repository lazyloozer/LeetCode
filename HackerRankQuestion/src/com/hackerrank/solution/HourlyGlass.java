package com.hackerrank.solution;

public class HourlyGlass {
	public static void main(String[] args) {
		int a[][]= {
//				{1,2,1,4,1,5},
//				{6,0,2,4,6,0},
//				{5,1,1,2,1,1},
//				{5,4,6,0,2,6},
//				{1,1,1,1,1,2},
//				{5,1,1,0,1,3},
				{1,1,1,0,0,0},
				{0,1,1,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0},
				
//		
		};
		int maxsum=a[0][0]+a[0][1]+a[0][2]+
				         a[1][1]+
				a[2][0]+a[2][1]+a[2][2];
		//int top=1;
		int sum=0;
		//while(top<=a.length-2) {
		for(int top=1;top<=a.length-2;top++) {
			for(int i=1;i<=a[0].length-2;i++) {
				sum=a[top-1][i-1]+a[top-1][i]+a[top-1][i+1]+
						 a[top][i]+
						a[top+1][i-1]+a[top+1][i]+a[top+1][i+1];
				
				
			
			if(sum>maxsum) {
				maxsum=sum;
			}
			}
			//top++;
		}
		System.out.println(maxsum);
		
	
	}

}
