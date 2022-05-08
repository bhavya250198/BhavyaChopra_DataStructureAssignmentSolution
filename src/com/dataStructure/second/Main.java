package com.dataStructure.second;

import com.dataStructure.second.implementation.Node;
import com.dataStructure.second.implementation.SkewedTree;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkewedTree skewed = new SkewedTree();
		skewed.root = new Node(50);
		skewed.root.left = new Node(30);
		skewed.root.right = new Node(60);
		skewed.root.left.left = new Node(10);
		skewed.root.right.left = new Node(55);
		
		skewed.displayDetails(skewed.root);
	}

}
