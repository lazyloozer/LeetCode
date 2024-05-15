package com.hackerrank.solution;

import java.util.ArrayList;
import java.util.Collections;

public class TwoSumLeetCode {
	public static void main(String[] args) {
		
	
	//Scanner sc=new Scanner(System.in);
	//String s="abc";
	//String s1 = s.substring(0);
	//System.out.println(s1);
//	for(int i=0;i<=s.length();i++) {
//		for(int j=i;j<=s.length();j++) {
//			for(int k=i;k<j;k++) {
//				System.out.print(s.charAt(k));
//			}
//			System.out.println(" ");
//		}
//	}

	
		 //Definition for singly-linked list.
		 class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) {
		    	 this.val = val;
		    	 }
		     ListNode(int val, ListNode next) { 
		    	 this.val = val; 
		    	 this.next = next; }
		 }
		 
		class Solution {
		    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		        if(list1!=null && list2!=null){
		            if(list1.val<list2.val){
		                list1.next=mergeTwoLists(list1.next,list2);
		                return list1;

		            }else{
		                list2.next=mergeTwoLists(list2.next,list1);
		                return list2;
		            }
		        }
		        if(list1==null)
		            return list2;
		            return list1;
		        }
		        
		    }


 
 

        
    }
}