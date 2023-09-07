/*
 * Write a program to input an array from the user and find the index of the smallest element 
in the array
 */



package neebal_assignment_4;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		 int minimum=1;
	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]<arr[minimum]) {
	    		 minimum=i;
	    	 }
	}
	     System.out.println("the minimum index value is"+minimum);
	}
}
