package com.hackerrank.solution;

//Create a Binary tree using Java



import java.util.Scanner;

class Node{

	int data;

	Node left, right;



	public Node(int data) {

		this.data  = data;

	}

}



class Tree{

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		createTree();

	}



	static Node createTree() {

		Node root = null;

		System.out.println("Enter the data of Node");

		int data = scan.nextInt();//10 20 15 40 35

		if(data==-1) {

			return null;

		}

		root = new Node(data);

		System.out.println("Enter left node for "+data);

		root.left = createTree();

		

		System.out.println("Enter right node for "+data);

		root.right = createTree();

		

		return root;

	}

}