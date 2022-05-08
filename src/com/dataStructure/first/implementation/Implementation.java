package com.dataStructure.first.implementation;
import java.util.*;
public class Implementation {
	public static int getMax(int arr[])
	{
		int max=0; int indexMax=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == max) {
				indexMax=i;
				break;
			}
		}
	return indexMax;
	}
       public void implementationDetails(int arr[]) {
    	   int n = arr.length;
    	   int value =0;
    	   int listSize=0;
    	   int stackSize=0;
    	   int stackValue=0;
    	   int stackPopValue=0;
    	   int difference=0;
    	   int remainingLength = 0;
    	   Stack<Integer> stack = new Stack<Integer>();
    	   ArrayList<Integer> list = new ArrayList<Integer>();
    	   int index = getMax(arr);
    	   if(index ==0) {
    		   System.out.println("Day:1");
    		   list.add(arr[0]);
    		   System.out.println(arr[index]);
//    		  remainingLength= n-index-1;
    		  for(int i=(index+1);i<n;i++) {
    			  System.out.println("Day:"+(i+1));
    			  difference = list.get(list.size()-1) - arr[i];
    			  if(difference == 1) {
    				  if(stack.size() == 0)
    				  {
    				  System.out.println(arr[i]);
    				  list.add(arr[i]);
    				  listSize=list.size();
    				  }
    				  else {
    					  System.out.print(arr[i]+" ");
    					  list.add(arr[i]);
        				  listSize=list.size();
        				  stackSize=stack.size();
    					  while(stackSize > 0){
    						  System.out.print(stack.pop());
    						  stackSize=stack.size();
    					  }
    				  }
    			  }
    			  else {
    				  System.out.println(" ");
    				  stack.push(arr[i]);
    			  }
    		  }
    	   }
    	   else {
    		   
    		   for(int i=0;i<=index;i++) {
    			   if(i <= index-1)
    			   {
    			   System.out.println("Day:"+(i+1));
    			   System.out.println("");
    			   stack.push(arr[i]);
    			   }
    			   else if(i == index) {
    				   System.out.println("Day:"+(i+1));
    				   list.add(arr[index]);
    				   listSize=list.size();
    				   stackSize= stack.size();
    				   System.out.print(arr[index]+" ");
    				   while(stackSize > 0) {
    					   value = list.get(listSize-1);
    					   stackValue = stack.peek();
    					   difference= value-stackValue;
    					   if(difference == 1) {
    						   stackPopValue = stack.pop();
    						   stackSize= stack.size();
    						   list.add(stackPopValue);
    						   listSize=list.size();
    						   System.out.print(stackPopValue+" ");
    					   }
    					   else
    						  break;
    				   }
    			   }
    			   
    		   }
    		   
    		   for(int j=(index+1);j<n;j++) {
    			   if(j == (index+1))
    			   {
    				   System.out.println();
    				   System.out.println("Day:"+(j+1));
    			   }
    			   else
    			   System.out.println("Day:"+(j+1));
    			   listSize=list.size();
    			   value = list.get(listSize-1);
    			   difference = value -arr[j];
    			   if(difference == 1)
    			   {
    				   if(j !=(n-1))
    				   System.out.println(arr[j]);
    				   else
    				   System.out.print(arr[j]+" ");
    				   list.add(arr[j]);
    			   }
    			   else {
    				   System.out.println();
    				   stack.push(arr[j]);
    			   }
    			   if(j == (n-1)) {
    				   stackSize= stack.size();
    				   listSize = list.size();
    				   while(stackSize >0) {
    					   value = list.get(listSize-1);
    					   stackValue = stack.peek();
    					   difference= value-stackValue;
    					   if(difference == 1) {
    						   stackPopValue = stack.pop();
    						   stackSize= stack.size();
    						   list.add(stackPopValue);
    						   listSize=list.size();
    						   System.out.print(stackPopValue+" ");
    					   }
    					   else
    						  break;
    				   }
    			   }
    		   }
    	   }
    	   
       }
}
