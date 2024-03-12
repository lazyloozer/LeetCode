package com.kodnest.numbers;


	import java.util.Scanner;
	public class SumSubarray {
	    public static int maxSubArraySum(int[] nums){

	    
	        int maxSum=nums[0];
	        int currentSum=nums[0];

	        for(int i=1; i<nums.length;i++){
	            currentSum=Math.max(nums[i], currentSum + nums[i]);
	            maxSum=Math.max(maxSum, currentSum);

	        }
	        return maxSum;
	    }
	    public static void  main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int size=sc.nextInt();
	        int[] arr1=new int[size];
	        for(int i=0;i<size;i++){
	            arr1[i]=sc.nextInt();
	        }
	        System.out.println(maxSubArraySum(arr1));
	    }
	}


