package com.leetcode.code;

public class LinkedList {
	int val;
	LinkedList next;
	LinkedList(){}
	LinkedList(int val)
	{
		this.val=val;
		
	}
	LinkedList(int val,LinkedList next){
		this.val=val;
		this.next=next;
	}
	//class TwoNumbers{
		public  static LinkedList addTwoNumbers(LinkedList l1,LinkedList l2) {
			//object creation for linkedlist
			LinkedList newdummy=new LinkedList(0);
			LinkedList tail=newdummy;
			int carry=0;
			while(l1!=null || l2!=null ||carry!=0) {
				int digit1=(l1!=null)? l1.val:0;
				int digit2=(l2!=null)? l2.val:0;
				
				int sum=digit1+digit2+carry;
				int digit=sum%10;
				carry=sum/10;
				 LinkedList newNode=new LinkedList(digit);
				 tail.next=newNode;
				 tail=tail.next;
				 l1=(l1!=null)?l1.next:null;
				 l2=(l2!=null)?l2.next:null;
				 
				
				
			}
			LinkedList result=newdummy.next;
			newdummy.next=null;
			return result;
			
			
		}
	}
	

//}
class solution{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		LinkedList.addTwoNumbers(l1, l1);
		
		
		
		
		
	}
}
