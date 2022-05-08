package com.dataStructure.first;
import java.util.*;
import com.dataStructure.first.implementation.Implementation;
public class Main {
	public static void main(String args[]) {
		try {
		Scanner ob = new Scanner(System.in);
		Implementation implementation = new Implementation();
		HashSet<Integer> hashset = new HashSet<Integer>();
		System.out.println("Enter the no of floors");
		int n = ob.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the floor size given on day :" + (i+1));
			arr[i]=ob.nextInt();
		}
		for(int num :arr) {
			hashset.add(num);
		}
		int hashsetSize = hashset.size();
		int arrayLength = arr.length;
		if(arrayLength == hashsetSize)
		implementation.implementationDetails(arr);
		else
		System.out.println("The Skyscrapper cannot be built.The sizes should be distinct");
		}
		catch(Exception ex) {
			System.out.println("No empty or null values");
		}
	}
}
