package com.kodnest.pratice;

public class VomelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello java!";
		int vomelcount=0;
		int constantcount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o' || ch=='u') {
				vomelcount++;
			}else {
				constantcount++;
			}
		}
		System.out.println(vomelcount);
		System.out.println(constantcount);

	}

}
