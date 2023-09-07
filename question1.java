/*
 * Write a program to input an array from the user and reverse the order of elements in an 
array in place i.e. without using any additional arrays.
 */
package neebal_assignment_4;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no element do you want");
		int n=sc.nextInt();
		int j,i;
		int arr[]=new int[n];
		System.out.println("enter the elements in the array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0,j=arr.length-1;i<j;i++,j--)
		{
			int temp=0;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("the reverse of the array is: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}

	}

}
