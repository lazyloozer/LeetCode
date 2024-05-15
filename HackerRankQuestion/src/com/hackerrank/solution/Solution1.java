package com.hackerrank.solution;

import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		for(int i=1;i<=n;i++) {
			String input=sc.nextLine();
			String[] split = input.split(" ");
			String name=split[0];
			int num=Integer.parseInt(split[1]);
			hs.put(name, num);
				
		}
	while(sc.hasNext()) {
			String name=sc.nextLine();
			if(hs.containsKey(name)){
				
			System.out.println(name+"="+hs.get(name));
			}else {
				System.out.println("Not Found");
			}
}
		}
			
			
			
		
		//System.out.print(hs+"");
	

}
