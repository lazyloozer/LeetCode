package com.kodnest.pratice;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Program");
		for(int i=0;i<=s.length()-1;i++) {
			if(i>0 ||s.length()<0){
				System.out.print("-");
			}
			System.out.print(s.charAt(i));
		}
	}

}
