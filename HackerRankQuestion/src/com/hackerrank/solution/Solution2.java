package com.hackerrank.solution;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        for(int i=0;i<total;i++){
            int size=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<size;j++){
                int item=sc.nextInt();
                list.add(item);
            } 
            mainlist.add(list);  
            
                 }
                 int totallist=sc.nextInt();
                 for(int k=0;k<totallist;k++){
                     int row=sc.nextInt();
                     int col=sc.nextInt();
                     try{
                         System.out.println(mainlist.get(row-1).get(col-1));
                     }catch(Exception e){
                         System.out.println("ERROR!");
                     }
                 }
            
    }
}