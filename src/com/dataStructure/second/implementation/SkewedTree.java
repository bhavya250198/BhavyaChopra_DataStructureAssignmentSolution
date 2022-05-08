package com.dataStructure.second.implementation;
import java.util.*;

public class SkewedTree {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public static Node root;
	public static Node root1;
	public SkewedTree(){
		root=null;
		root1=null;
	}
	public ArrayList<Integer> printInorderList(Node root) {
		if(root == null) 
			return list;
		printInorderList(root.left);
		list.add(root.key);
		printInorderList(root.right);
		return list;
	}
	public static void printInorder(Node root1) {
		if(root1 == null) 
			return;
		printInorder(root1.left);
		System.out.print(root1.key+" ");
		printInorder(root1.right);
		
	}
	public static void insert(int number) {
		try {
			root1= insertRec(root1,number);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static Node insertRec(Node root1,int number) {
		if(root1 == null) {
			root1 = new Node(number);
			return root1;
		}
		if(number <root1.key)
			root1.left = insertRec(root1.left,number);
		else if(number > root1.key)
			root1.right = insertRec(root1.right,number);
		return root1;
	}
	public void displayDetails(Node root) {
		ArrayList<Integer> arr = printInorderList(root);
		for(int num :arr) {
			insert(num);
		}
		
		printInorder(root1);
	}
}
