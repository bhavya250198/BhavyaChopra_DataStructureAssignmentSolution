package com.dataStructure.first;
import java.util.*;
import com.dataStructure.first.implementation.Implementation;
public class Main {
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the no of floors");
		int n = ob.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the floor size given on day :" + (i+1));
			arr[i]=ob.nextInt();
		}
		Implementation implementation = new Implementation();
		implementation.implementationDetails(arr);
	}
}
